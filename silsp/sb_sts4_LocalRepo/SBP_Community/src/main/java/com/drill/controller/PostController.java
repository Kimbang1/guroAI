package com.drill.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.drill.domain.Post;
import com.drill.domain.User;
import com.drill.dto.ResUserDto;
import com.drill.svc.PostService;

import jakarta.servlet.http.HttpSession;

@Controller
public class PostController {

	// 글쓰기 페이지
	@GetMapping("/write")
	public String write() {
		return "post/write";
	}

	@PostMapping("/write")
	public @ResponseBody ResUserDto<?> postWrite(@RequestBody Post post, HttpSession session) {
		User sid = (User) session.getAttribute("sid");
		post.setUser(sid);
		postService.write(post);
		return new ResUserDto<>(HttpStatus.OK.value(), "등록완료!");
	}
}
