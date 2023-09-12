package pz.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;
import map.NaverMap;
import pz.service.AdminService;
import pz.service.CafePZService;
import pz.service.CafeService;
import pz.service.PZService;
import pz.service.PlaceService;
import pz.service.UserService;
import pz.vo.CafePZVo;
import pz.vo.CafeVo;
import pz.vo.PZVo;
import pz.vo.PlaceVo;
import pz.vo.UserVo;

@Controller
@Slf4j
public class MainController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	AdminService adminService;
	
	@Autowired
	CafeService cafeService;
	
	@Autowired
	CafePZService cafepzService;
	
	@Autowired
	PZService pzService;
	
	@Autowired
	PlaceService placeService;
	
	@GetMapping("main.do")
	public ModelAndView main(
			@CookieValue(value = "autoLogin", required = false) boolean autoLoginCookie,
			@CookieValue(value = "userid", required = false) String useridCookie,
			@CookieValue(value = "cafeid", required = false) String cafeidCookie,
			HttpServletRequest request
			) throws Exception {
		
		ModelAndView mv = new ModelAndView("main");
		
		List<String> juso = placeService.selectAllAddr();
		System.out.println("::::::::::::::::@@@@@@"+ juso);
		
		NaverMap map = new NaverMap();
		
		log.info("주소검색 시작");
		List<Map<String, String>> maps =  map.mapAllInfo(juso);
		mv.addObject("maps", maps);
		log.info("주소검색 끝");
		
		/*
		 * List<CafePZVo> cafePZVo = cafepzService.selectCafePZList(maps);
		 * mv.addObject("cafePZLists", cafePZVo);
		 */
		
		UserVo userVo = null;
		CafeVo cafeVo = null;
		
		//session
		HttpSession session = request.getSession();
        String userid = (String) session.getAttribute("userid");
        String cafeid = (String) session.getAttribute("cafeid");
		
		if(autoLoginCookie) {
			 if(useridCookie != null) {
		        	userVo = userService.sessionLogin(useridCookie);
		        	mv.addObject("session", useridCookie);
		        } 
		        if(cafeidCookie != null) {
		        	cafeVo = cafeService.sessionLogin(cafeidCookie);
		        	mv.addObject("session", cafeidCookie);
		        }
			} else {
				if(userid != null) {
					userVo = userService.sessionLogin(userid);
					mv.addObject("session", userid);
				}
				if(cafeid != null) {
					cafeVo = cafeService.sessionLogin(cafeid);
					mv.addObject("session", cafeid);
				}
			}

    	mv.addObject("userVo", userVo);
    	mv.addObject("cafeVo", cafeVo);
    	
    	if(useridCookie != null || userid != null) {
    		if(userVo.getAuth().equals("M") || userVo.getAuth().equals("Y")) {
        		List<UserVo> userInfos = adminService.selectUserInfos();
        		mv.addObject("userInfos", userInfos);
        		List<PlaceVo> placeInfos = adminService.selectWaitPlaces();
        		mv.addObject("waitPlaces", placeInfos);
        		List<CafeVo> cafeLists = adminService.selectCafeLists();
        		mv.addObject("cafeLists", cafeLists);
        	}
    	}
		/* System.out.println(mv); */
		return mv;
	}
	/*
	 * @PostMapping("/selectWhereInfo.do")
	 * 
	 * @ResponseBody public ModelAndView selectWhereInfo(@RequestParam String addr)
	 * throws Exception { // addr 값을 사용하여 데이터 추출 PlaceVo placeVo = null; CafeVo
	 * cafeVo = null; ModelAndView mv = new ModelAndView("main");
	 * mv.addObject("placeVo", placeVo); mv.addObject("cafeVo", cafeVo);
	 * 
	 * CafeVo cafeInfo = cafeService.selectCafeInfo(addr); mv.addObject("cafeInfo",
	 * cafeInfo);
	 * 
	 * PlaceVo placeInfo = placeService.selectPlaceInfo(addr);
	 * mv.addObject("placeInfo", placeInfo);
	 * System.out.println("Cafe VS Place:::::::" + cafeInfo); return mv; }
	 */
	
	 @PostMapping("/determineTable.do")
	 @ResponseBody
	    public String determineTable(@RequestParam String addr) throws Exception {
		 	System.out.println("Controller:@@@@@@@@@"+ addr);
		 	// addr 값을 사용하여 cafeInfo 테이블과 비교
	        int isCafe = cafeService.checkAddressInCafeInfo(addr);
	        //addr이 cafeinfo에 있는경우 true
	        System.out.println("@@@@@@@@@@@@@@@" + isCafe);
	        if (isCafe == 1) {
	            return "cafeInfo"; // cafeInfo 테이블에 있으면 cafeInfo로 매핑
	        } else {
	            return "placeInfo"; // placeInfo로 매핑
	        }
	 	}
	
	@PostMapping("/cafeInfo.do")
	@ResponseBody
    public CafeVo cafeInfo(@RequestParam String addr) throws Exception {
        // addr 값을 사용하여 데이터 추출
        CafeVo vo = cafeService.selectCafeInfo(addr);
        
        return vo;
    }
	
	@PostMapping("/cafePZList.do")
	@ResponseBody // JSON 형식의 데이터를 반환 
	public Map<String,Object> cafePZList(@RequestParam String addr) throws Exception { 
		System.out.println("@@@@@@@@@@@@@"+addr);
		List<CafePZVo> cafePZLists = cafepzService.selectCafePZList(addr);
		CafeVo vo = cafeService.selectCafeInfo(addr);
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("CafePZList",cafePZLists );
		map.put("CafeVo", vo);
		System.out.println("Controller:::::::::::::"+map); 
		return map; 
	 }
	 
	@PostMapping("/pzInfo.do")
	@ResponseBody
    public PlaceVo pzInfo(@RequestParam String addr) throws Exception {
        // addr 값을 사용하여 데이터 추출
        PlaceVo vo = placeService.selectPlaceInfo(addr);
        System.out.println("Controller"+vo);
        return vo;
    }
	
	@PostMapping("/pzList.do")
	@ResponseBody // JSON 형식의 데이터를 반환 
	public Map<String,Object> pzList(@RequestParam String addr) throws Exception { 
		
		List<PZVo> PZLists = pzService.selectPZList(addr);
		PlaceVo vo = placeService.selectPlaceInfo(addr);
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("PZList",PZLists );
		map.put("PlaceVo", vo);
		System.out.println("Controller:::::::::::::"+map); 
		return map; 
	 }
	 
	@PostMapping("/idCheck.do")
	@ResponseBody
	public boolean idCheck(String cafeid, String userid) throws Exception {
		boolean userResult = false;
		boolean cafeResult = false;
		
		if (cafeid != null) {
			userResult = userService.idCheck(cafeid);
			cafeResult = cafeService.idCheck(cafeid);
		}
		if (userid != null) {
		 	userResult = userService.idCheck(userid);
		 	cafeResult = cafeService.idCheck(userid);
		}
		return (userResult == cafeResult) ? true : false;
		
		}
	
	
}
