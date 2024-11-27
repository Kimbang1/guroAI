package com.exam.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	//데이터 설정 및 반환값으로 뷰(=jsp 파일명)지정
	
	@RequestMapping("/test1")
	public String test1(Model model) {
		//데이터 설정 및 반환값으로 뷰(=jsp파일명)지정
		
		
		//model.addAttribute("키","값");
		model.addAttribute("name","저장값");
		return"test1";
	}

@RequestMapping("/mv")	
public ModelAndView test2() {
	
	ModelAndView mv = new ModelAndView();
	List<String> objList = new ArrayList<>();
	objList.add("딸기");
	objList.add("귤");
	objList.add("수박");
	mv.addObject("lists",objList);
	
	
	
	mv.addObject("ObjectTest","점검용텍스트");
	mv.addObject("name","테스터2");
	
	mv.setViewName("subDir/sampleView");
	
	return mv;
}
}
