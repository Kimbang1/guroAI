package com.exam.cmd;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MemberController {

	@RequestMapping("/")
	public String index() {

		return "/index";

	}

//	@RequestMapping("/req")
//	public ModelAndView mtdReq(HttpServletRequest req) {
//		
//		ModelAndView mv = new ModelAndView();
//		String uid = null;
//		String uname = null;
//		try {
//			req.setCharacterEncoding("UTF-8");
//			uid = req.getParameter("uid");
//			uname = req.getParameter("uname");
//			mv.addObject("uid", uid);
//			mv.addObject("uname", uname);
//			mv.setViewName("mtdReq");
//		} catch (Exception e) {
//			e.getMessage();
//		}
//		return mv;
//	}
//	
	@RequestMapping("/req")
	public ModelAndView mtdReq(
			@RequestParam("uid")String uid,
			@RequestParam("uname")String uname,
			Model modle
			) {

		ModelAndView mv = new ModelAndView();

		
			mv.addObject("uid", uid);
			mv.addObject("uname", uname);
			mv.setViewName("/mtdReq");
		
	
			return mv;
	}
//	@RequestMapping("/req")
//	public String mtdReq(HttpServletRequest req, Model model) {
//		
//		String uid = null;
//		String uname = null;
//		try {
//			req.setCharacterEncoding("UTF-8");
//			uid=req.getParameter("uid");
//			uname = req.getParameter("uname");
//		}catch(Exception e) {
//			e.getMessage();
//		}
//		model.addAttribute("uid",uid);
//		model.addAttribute("uname",uname);
//		return "mtdReq";
//	}
	
	@RequestMapping("/reqCmd")
	public String mtdReqCmd(Member member) {
		
		return"mtdReq";
	}
}
