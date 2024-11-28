package com.rest.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

	private int num;				//일련번호
	private String userid;			//아이디
	private String password;		//비밀번호
	private String email;			//이메일
}
