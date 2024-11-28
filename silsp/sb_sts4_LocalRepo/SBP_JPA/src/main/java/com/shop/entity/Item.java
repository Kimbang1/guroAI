package com.shop.entity;

import java.time.LocalDateTime;

import com.shop.constant.ItemSellStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;

//DTO
@Entity
@Table(name="item")

@Data 
public class Item {

	@Id
	@Column(name="item_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;		//상품코드
	
	@Column(nullable=false,length=50)
	private String itemNm;	//상품명
	
	@Lob
	@Column(nullable = false)
	private String itemDetail;	//상세설명
	
	@Column(name = "price",nullable=false)
	private int price;			//가격
	@Column(name = "stockNumber",nullable = false)
	private int stockNumber;	//재고
	
	@Enumerated(EnumType.STRING)
	private ItemSellStatus itemSellStatus;	//상품 판매 상태
	
	private LocalDateTime regTime;			//등록 시간
	private LocalDateTime updateTime;		//수정시간
	
	
}
