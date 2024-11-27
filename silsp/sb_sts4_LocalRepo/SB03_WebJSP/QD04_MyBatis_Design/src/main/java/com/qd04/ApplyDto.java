package com.qd04;

import java.sql.Date;

import lombok.Data;

@Data
public class ApplyDto {
	
	private String userName;
	private String userPhone;
	private String applyPart;
	private String applyMotive;
	private Date applyTM;
	
}
