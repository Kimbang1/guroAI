package com.drill.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.drill.domain.User;
import com.drill.dto.ResUserDto;
import com.drill.svc.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {
	
	@Autowired
	private UserService userService;
	
	//메인 인덱스 페이지
	@GetMapping({"","/"})
	public String getIndex() {
		return "index";
	}
	
	//회원가입
	@GetMapping("/join")
	public String join() {
		return "user/join";
	}
	
	@PostMapping("/join")
	@ResponseBody
	public ResUserDto<?> postJoin(@RequestBody User user){
		User findUser=userService.getUser(user.getUserid());
		if(findUser.getUserid() == null) {
			userService.join(user);
			return new ResUserDto<>(HttpStatus.OK.value(),user.getUserid()+"회원가입 완료!");
		}else {
			
			return new ResUserDto<>(HttpStatus.BAD_REQUEST.value(),user.getUserid()+"는 사용중이요.");
		}
		
	}
	
	//로그인 입력양식
	@GetMapping("/login")
	public String login() {
		return"user/login";
	}
	
	
	//로그인 처리
	@PostMapping("/login")
	@ResponseBody
	public ResUserDto<?> postLogin(@RequestBody User user,HttpSession session){
		
		User findUser=userService.getUser(user.getUserid());
		
		if(findUser.getUserid()==null) {
			//아이디 없음
			return new ResUserDto<>(HttpStatus.BAD_REQUEST.value(),"로그인 정보를 확인하게.");
		
		}else {
			if(user.getPassword().equals(findUser.getPassword())) {
				//로그인 정상 처리
				session.setAttribute("sid", findUser);
				session.setMaxInactiveInterval(300);
				return new ResUserDto<>(HttpStatus.OK.value(),findUser.getUserid()+"로그인 중!");
			}else {
				//비밀번호 틀림
				return new ResUserDto<>(HttpStatus.BAD_REQUEST.value(),"로그인 정보를 확인하게.");
			}
		}
		
	}
	
	//로그아웃
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return"redirect:/";
	}
	
}
