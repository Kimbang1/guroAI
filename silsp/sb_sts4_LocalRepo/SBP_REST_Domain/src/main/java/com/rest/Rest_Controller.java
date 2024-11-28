package com.rest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rest.domain.User;

@RestController
public class Rest_Controller {

	//GET: Select
	@GetMapping("restEx")
	public User restExGet() {
		
		User selUser = User.builder()
						.num(1)
						.userid("lemon")
						.password("1234")
						.email("lemon@naver.com")
						.build();
		return selUser;
	}
	//POST: INSERT
	@PostMapping("restEx")
	public String restExPost(@RequestBody User user) {
		
		return "POST 요청 처리 입력 값:" + user.toString();
	}
	//PUT: UPDATE
	@PutMapping("restEx")
	public String restExPut() {
		return"PUT 요청처리";
	}
	//DELETE: DELETE
	@DeleteMapping("restEx")
	public String restExDelete(@RequestParam("num") String num) {
		return"DELETE 요청처리 입력 값:" +num;
	}
}
