package pz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import pz.service.PZService;
import pz.vo.PZVo;

@Controller
public class PZController {

	@Autowired
	PZService pzService;
	

	@PostMapping("/PZWrite.do")
	@ResponseBody
	public boolean PZWrite(PZVo vo) throws Exception {
		return pzService.PZWrite(vo);
	}
	
	@GetMapping("/deletePZ.do")
	@ResponseBody
	public ModelAndView deletePZ(String unq) throws Exception {
		pzService.deletePZ(unq);
		ModelAndView mv = new ModelAndView("redirect:/main.do");
		return mv;
	}
	
}
