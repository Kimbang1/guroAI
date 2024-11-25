 package com.qd03.dao;

import java.util.List;
import com.qd03.dto.GoodsDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper	//클래스의 객체를 만들어주는 역활
public interface GoodsDao {
    public void saveGoods(GoodsDto goodsDto); // 상품 등록
    public List<GoodsDto> getAllGoods();      // 상품 목록 출력
    public List<GoodsDto> searchGoods(String keyword); // 상품 검색
    public void deleteGoods(List<Integer> numList);         // 상품 다중 삭제
}
