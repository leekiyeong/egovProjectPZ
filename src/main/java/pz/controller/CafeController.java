package pz.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;
import pz.service.CafeService;
import pz.vo.CafeMenuVo;
import pz.vo.CafePZVo;
import pz.vo.CafeVo;


@Controller
@Slf4j
public class CafeController {

	@Autowired
	CafeService cafeService;
	@PostMapping("/cafeSignup.do")
	@ResponseBody
	public boolean signup(CafeVo vo) throws Exception {
		return cafeService.signup(vo);
	}
	
	  @PostMapping("/cafeIdCheck.do")
	  
	  @ResponseBody public boolean idCheck(String cafeid) throws Exception {
	  boolean result = cafeService.idCheck(cafeid); 
	  return result; 
	  }
	
	
	@GetMapping("/cafeLogin.do")
	@ResponseBody
	public ModelAndView login(@RequestParam String cafeid, @RequestParam String pwd, @RequestParam boolean autoLogin,
																HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:main.do");
		
		CafeVo vo = cafeService.login(cafeid, pwd);
		
		String cafeName = vo.getCafename();
		if(vo == null || cafeName == null) {
			return mv;
		}
		
		if(autoLogin) {
			Cookie autoLoginCookie = new Cookie("autoLogin", String.valueOf(autoLogin));
			autoLoginCookie.setMaxAge(60 * 60 * 24 * 10); //10일 유지
			Cookie cafeidCookie = new Cookie("cafeid", cafeid);
			cafeidCookie.setMaxAge(60 * 60 * 24 * 10); //10일 유지
			
			response.addCookie(autoLoginCookie);
			response.addCookie(cafeidCookie);
		} else {
			HttpSession session = request.getSession();
			session.setAttribute("cafeid", vo.getCafeid());
		}
		
		mv.addObject("vo", vo);	
		
		return mv;
	}
	
	@GetMapping("cafeLogout.do")
	public ModelAndView logout(
			@CookieValue(value = "autoLogin", required = false) boolean autoLoginCookie,
			HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:main.do");
		
		if(autoLoginCookie) {
			Cookie autoLoginCookie2 = new Cookie("autoLogin", null);
			autoLoginCookie2.setMaxAge(0); //0초 유지
			Cookie cafeidCookie = new Cookie("cafeid", null);
			cafeidCookie.setMaxAge(0); //0초 유지
			
			response.addCookie(autoLoginCookie2);
			response.addCookie(cafeidCookie);
		} else {
			HttpSession session = request.getSession();
			session.removeAttribute("cafeid");
		}
		
		return mv;
	}
	
	@PostMapping("/updateCafe.do")
	@ResponseBody
	public int updateCafe(CafeVo vo) throws Exception {
		log.info("{}", vo);
		int result = cafeService.updateCafe(vo);
		log.info("result: {}", result);
		return result;
	}
	
	@PostMapping("/cafenameCheck.do")
	@ResponseBody
	public boolean nicknameCheck(String cafename) throws Exception {
		log.info("cafename: {}", cafename);
		boolean result = cafeService.cafenameCheck(cafename);
		return result;
	}
	
	 //카페승인
	 @PostMapping("/approveCafe")
	 @ResponseBody
	 public int approveCafe(@RequestParam String cafeid) throws Exception {
        // 승인 작업 수행
        int result = cafeService.approveCafe(cafeid);
		return result; // 성공 시 응답 반환
    }
	 //카페거절
	 @PostMapping("/rejectCafe")
	 @ResponseBody
	 public int rejectCafe(@RequestParam String cafeid) throws Exception {
        // 승인 작업 수행
        int result = cafeService.rejectCafe(cafeid);
		return result; // 성공 시 응답 반환
    }
	 //카페승인정보
	 @PostMapping("/getCafeInfo")
     @ResponseBody
     public CafeVo getCafeInfo(@RequestParam String cafeid) throws Exception {
        // cafeId에 해당하는 카페 정보를 데이터베이스에서 가져옴
        CafeVo vo = cafeService.getCafeInfoById(cafeid);
        
        return vo;
    }
 
 	@PostMapping("/getCafeMenu.do")
	@ResponseBody
	public Map<String, Object> getCafeMeun(@RequestParam String addr) throws Exception {
		
		CafeMenuVo menuVo = cafeService.getCafeMenu(addr);
		
		ObjectMapper objectMapper = new ObjectMapper();
		@SuppressWarnings("unchecked")
		Map<String, Object> map = objectMapper.convertValue(menuVo, Map.class);
		
		return map;
	}
	
	@PostMapping("/addCafeMenu.do")
	@ResponseBody
	public boolean addCafeMenu(CafeMenuVo vo) throws Exception {
		return cafeService.addCafeMenu(vo);
	}
	
	@PostMapping("/updateCafeLikes.do")
	@ResponseBody
	public boolean updateCafeLikes(@RequestParam String addr) throws Exception {
		return cafeService.updateCafeLikes(addr);
	}
	
	@PostMapping("/getCafeInstaId.do")
	@ResponseBody
	public String getCafeInstaId(@RequestParam String addr) throws Exception {
		String cafeInstaId = cafeService.getCafeInstaId(addr);
		System.out.println(cafeInstaId);
		return cafeInstaId;
	}
		
}
