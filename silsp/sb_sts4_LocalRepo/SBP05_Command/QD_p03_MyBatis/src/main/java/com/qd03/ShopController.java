package com.qd03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.qd03.dao.GoodsDao;
import com.qd03.dto.GoodsDto;

@Controller
public class ShopController {

	@Autowired
	private GoodsDao goodsDao;
	
	
	//view1 상품 등록
	@GetMapping("/")
	private String reg(){
		return "/product/goodsReg";
	}
	
	// 상품 등록 처리
	@PostMapping("/reg")
	public String addProduct(@ModelAttribute GoodsDto goodsDto) {

	    // regTM이 null이 아닌지 체크 후 처리
	    if (goodsDto.getRegTM() != null) {
	        String rawDateString = goodsDto.getRegTM().toString(); // regTM이 null이 아니면 toString() 처리
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // 날짜 형식 지정
	        try {
	            java.util.Date formattedDate = sdf.parse(rawDateString); // String을 Date로 변환
	            goodsDto.setRegTM(new java.sql.Date(formattedDate.getTime())); // SQL Date로 설정
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
	    } else {
	        // regTM이 null인 경우 기본값 설정 (예: 현재 날짜)
	        goodsDto.setRegTM(new java.sql.Date(System.currentTimeMillis())); // 현재 날짜로 설정
	    }

	    goodsDao.saveGoods(goodsDto);
	    return "redirect:/list";
	}
	
	//view2 상품 목록 출력
	@RequestMapping("/list")
	private String list(Model model) {
		List<GoodsDto>goodsList = goodsDao.getAllGoods();
		model.addAttribute("goodsList", goodsList);
		return"/product/goodsList";
	}
	
	//view3 상품 검색
	@RequestMapping("/search")
	private String search(@RequestParam("keyword") String keyword, Model model) {
		List<GoodsDto>searchResult = goodsDao.searchGoods(keyword);
		model.addAttribute("goodsList", searchResult);
		return"/product/goodsList";
	}
	//view4 상품 삭제
	@RequestMapping("/del")
	private String del(@RequestParam(name="num",required=false) List<Integer> numList) {
		if(numList == null || numList.isEmpty()) {
			return"redirect:/list?error=상품을 선택하지 않았슈";
		}
		goodsDao.deleteGoods(numList);
		return"redirect:/list";
	}
	
	

}
