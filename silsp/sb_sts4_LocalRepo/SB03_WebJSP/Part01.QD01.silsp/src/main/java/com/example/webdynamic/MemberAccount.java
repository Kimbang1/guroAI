package com.example.webdynamic;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.webdynamic.dto.SignupRequest;

import jakarta.validation.Valid;

@Controller
public class MemberAccount {

		@RequestMapping("/")
		public String signup() {
			return "/member/join";
		}
		
		@PostMapping("/submit")
		public String signup(@Valid @ModelAttribute SignupRequest request, BindingResult result) {
			if(result.hasErrors()) {
				return"/member/welcom";
			}
			return"succes";
		}

}
