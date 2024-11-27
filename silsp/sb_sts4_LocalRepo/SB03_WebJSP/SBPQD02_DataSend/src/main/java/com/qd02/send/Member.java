package com.qd02.send;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import jakarta.servlet.http.HttpServletRequest;



@Controller
public class Member {

	@RequestMapping("/send")
	public String login() {
	return"/mem/login";
	}
	
	@RequestMapping("/receive")
	public String mtdRecieve(HttpServletRequest req, Model model) {
		String email = req.getParameter("email");
		String pwd = req.getParameter("pwd");
		
		model.addAttribute("email", email);
		model.addAttribute("pwd", pwd);
	return"/mem/loginProc";
	}
	
}
