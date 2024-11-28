package com.exam.lombok;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@RequestMapping("/")
	public String root()throws Exception{
		return"dataPrn";
	}
	@RequestMapping("/reqCmd")
	public String mtdReqCmd(Goods goods) {
		
		return"dataPrn";
	}
}
