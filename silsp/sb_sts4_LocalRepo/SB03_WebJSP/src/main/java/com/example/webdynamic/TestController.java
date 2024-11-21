package com.example.webdynamic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/")
	public String mtd() {
		return "index";
//			명칭: view
	}
	
	@RequestMapping("/test")
	public String test() {
		return "test";
	}
	
	@RequestMapping("/sample")
	public String sample() {
		return "subDir/sample";
	}
}
