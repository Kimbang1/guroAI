package com.shop.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

//쿼리 메세드(where 검색)
	List<Item> findByItemNm(String itemNm);

	// Or 쿼리 메서드
	List<Item>	findByItemNmOrItemDetail(
				String	itemNm,	String itemDetail
				);
}
