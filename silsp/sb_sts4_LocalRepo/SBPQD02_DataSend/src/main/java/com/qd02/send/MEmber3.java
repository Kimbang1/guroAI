package com.qd02.send;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MEmber3 {

	@RequestMapping("/ask")
	public String ask() {
	return"/job/ask";	
	}
	
	@RequestMapping("/askProc")
	public String mtdaskProc(MemBerC meB) {
		return"/job/askProc";
	}
}
