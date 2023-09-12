package pz.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import pz.service.CafePZService;
import pz.vo.CafePZVo;

@Controller
public class CafePZController {

	@Autowired
	CafePZService cafepzService;

	@PostMapping("/cafePZWrite.do")
	@ResponseBody
	public boolean cafePZWrite(CafePZVo vo) throws Exception {
		return cafepzService.cafePZWrite(vo);
	}
	
	@GetMapping("/deleteCafePZ.do")
	@ResponseBody
	public ModelAndView deleteCafePZ(String unq) throws Exception {
		cafepzService.deleteCafePZ(unq);
		ModelAndView mv = new ModelAndView("redirect:/main.do");
		return mv;
	}
	
}
