/*
package pz.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import map.NaverMap;
import pz.service.AdminService;
import pz.service.UserService;
import pz.vo.UserVo;

@Controller
public class MainController_backup {
	
	@Autowired
	UserService userService;
	
	@Autowired
	AdminService adminService;
	
	@GetMapping("main.do")
	public ModelAndView main(
			@CookieValue(value = "autoLogin", required = false) boolean autoLoginCookie,
			@CookieValue(value = "userid", required = false) String useridCookie,
			HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView("main");
		
		List<String> juso = new ArrayList<String>();
		juso.add("서울특별시 송파구 잠실동 10");
		juso.add("충청남도 보령시 신흑동 2267-3");
		juso.add("강원특별자치도 속초시 조양동 1450-143");
		juso.add("경기도 파주시 상지석동 1086-2");
		juso.add("경기도 가평군 상면 행현리 623-3");
		
		NaverMap map = new NaverMap();
		
		List<Map<String, String>> maps =  map.mapAllInfo(juso);
		mv.addObject("maps", maps);
		
		UserVo userVo = null;
		
		//session
		HttpSession session = request.getSession();
        String userid = (String) session.getAttribute("userid");
		
		if(autoLoginCookie) {
	        if(useridCookie != null) {
	        	userVo = userService.sessionLogin(useridCookie);
	        }
	        mv.addObject("session", useridCookie);
		} else {
	        if(userid != null) {
	        	userVo = userService.sessionLogin(userid);
	        }
	        mv.addObject("session", userid);
		}

    	mv.addObject("userVo", userVo);
    	
    	if(useridCookie != null || userid != null) {
    		if(userVo.getAuth().equals("M") || userVo.getAuth().equals("Y")) {
        		List<UserVo> userInfos = adminService.selectUserInfos();
        		mv.addObject("userInfos", userInfos);
        	}
    	}
		
		return mv;
	}
	
}

*/