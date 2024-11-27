package com.qd02.send;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



//컨트롤이 두개일경우 폼경로만 잘 짜주면 거의 충돌날 가능성은 없지만
//만약 일어나게 된다면 @Controller 아래에 접두사를 하나 붙여준다
//그전에 jsp파일도 분리시켜줘야 한다.
//예를 들어 mem과 register라는 파일로 나누어주고 컨트롤러를 추가해야 충돌날 오류가 적어진다.

//@Controller
//@RequestMapping("/mem)
//......

//@Controller
//@RequestMapping("/register)
//......


@Controller
public class MEMBER2 {

	@RequestMapping("/join")
	public String join() {
		return"/mem/join";
	}
	
	@RequestMapping("/joinProc")
	public String mtdJPCParam(
			
			//	@RequestParam 어노테이션을 사용
			@RequestParam("email") String email,
			@RequestParam("pwd") String pwd,
			@RequestParam(value="agree",required=false,defaultValue="0") String agree,
			Model model
			) {
		
		int agreeValue = agree.equals("on")?1:0;
		
		model.addAttribute("email", email);
		model.addAttribute("pwd", pwd);
		model.addAttribute("agree", agreeValue);
		
		return "/mem/joinProc";
	}
}
