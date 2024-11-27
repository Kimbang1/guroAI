package com.exam.basic.dto;

import lombok.Data;

@Data
public class BoardDto {
	
	private int num;
	private String writer;
	private String title;
	private String content;
}
