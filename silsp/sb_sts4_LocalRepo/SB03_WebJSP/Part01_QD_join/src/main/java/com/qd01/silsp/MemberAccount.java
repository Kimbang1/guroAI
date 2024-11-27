package com.qd01.silsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberAccount {

		@RequestMapping("/")
		public String signup() {
			return"/member/join";
		}
}
