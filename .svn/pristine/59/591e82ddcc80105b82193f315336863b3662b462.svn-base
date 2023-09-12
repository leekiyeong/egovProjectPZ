package pz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;
import pz.service.AdminService;
import pz.service.PlaceService;
import pz.vo.PlaceVo;

@Controller
@Slf4j
public class PlaceController {

	@Autowired
	PlaceService placeService;
	
	@Autowired
	AdminService adminService;
	
	@PostMapping("/addPlace.do")
	@ResponseBody
	public boolean addPlace(PlaceVo vo) throws Exception {
		return placeService.insertPlace(vo);
	}
	
	@PostMapping("/acceptPlace.do")
	@ResponseBody
	public boolean acceptPlace(String unq) throws Exception {
		return placeService.acceptPlace(unq);
	}
	
	@PostMapping("/rejectPlace.do")
	@ResponseBody
	public boolean rejectPlace(String unq) throws Exception {
		return placeService.rejectPlace(unq);
	}
	
	@GetMapping("waitPlaceInfo.do")
	@ResponseBody
	public ModelAndView waitPlaceInfo(int index) throws Exception {
		ModelAndView mv = new ModelAndView("addLocationAccept");
		
		List<PlaceVo> places = adminService.selectWaitPlaces();
		mv.addObject("place", places.get(index));
		
//		return places.get(index);
		return mv;
	}
	
}
