package com.qd06.dto;

import java.sql.Date;
//날짜만 다룰꺼면 이렇게
import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class applyDto {
	private int num;
	private String userName;
	private String userPhone;
	private String applyPart;
	private String applyMotive;
	private Timestamp applyTM;
	
}
