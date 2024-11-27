package com.shop.repo;

import java.time.LocalDateTime;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.shop.constant.ItemSellStatus;
import com.shop.entity.Item;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
class ItemRepositoryTest {
	@Autowired
	ItemRepository itemRepository;

	@Test
	@DisplayName("상품	저장	테스트")
	void test() {
		Item item = new Item();
		item.setItemNm("테스트	상품");
		item.setPrice(30000);
		item.setItemDetail("테스트	상품	상세보기");
		item.setItemSellStatus(ItemSellStatus.SELL);
		item.setStockNumber(50);
		item.setRegTime(LocalDateTime.now());
		item.setUpdateTime(LocalDateTime.now());
		Item savedItem = itemRepository.save(item);
		System.out.println(savedItem.toString());
	}

}
