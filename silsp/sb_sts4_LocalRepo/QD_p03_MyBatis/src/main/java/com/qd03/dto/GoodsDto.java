package com.qd03.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class GoodsDto {
	
	private int num;
	private String goodsName;
	private String goodsCode;
	private int price;
	private int cnt;
	private Date regTM;
}
