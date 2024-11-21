package com.example.webdynamic.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class SignupRequest {

	@NotBlank(message="아이디는 필수 입력항목입니다.")
	@Pattern(regexp="^[가-힣a-Z0-9]+$",message="한글,영문,숫자만 가능합니다.")
	@Size(min=5,max=20,message="아이디는 5~20자 이내여야 합니다.")
	private String userId;
	
	
	@NotBlank(message="비밀번호도 필수 입력항목입니다.")
	@Size(min=8, message="비밀번호는 최소 8자 이상입니다.")
	private String password;
	
	
	@NotBlank(message="이름도 필수 입력항목입니다.")
	private String username;
}
