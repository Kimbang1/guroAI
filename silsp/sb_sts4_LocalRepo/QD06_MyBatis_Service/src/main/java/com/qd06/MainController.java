package com.qd06;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.qd06.Service.Service1;
import com.qd06.dao.ApplyDao;

@Controller
public class MainController {
	
	@Autowired
	private Service1 service1;

	 @Autowired
	 private ApplyDao applyDao;
	
	@GetMapping("/")
	@ResponseBody
	public String root() throws Exception {
		return "개발자 지원서 작업";
	}

	// 지원서 입력양식
	@GetMapping("/applyForm")
	public String applyForm() {
		return "applyForm";
	}
	
	//지원서 수정 양식
	@GetMapping("/refactor")
	public String refactor(@RequestParam("num") String num, Model model){
	    
	    // 수정할 지원자 정보 model에 추가
			model.addAttribute("applyDto", service1.applyDetail(num));
	    return "refactor"; // 수정 페이지로 이동
	}

	//수정 처리 메서드
	
	@PostMapping("/applyUpdateProc")
	
	    
		public String mtdUpdateProc(
				@RequestParam(value="num")String num,
				@RequestParam(value="userName") String userName,
				@RequestParam(value="userPhone") String userPhone,
				@RequestParam(value="applyPart") String applyPart,
				@RequestParam(value="applyMotive") String applyMotive,
				RedirectAttributes redAttr
				) {
			
			Map<String, String> map = new HashMap<>();
			
			map.put("num", num);
			map.put("userName", userName);
			map.put("userPhone", userPhone);
			map.put("applyPart", applyPart);
			map.put("applyMotive", applyMotive);
			
			service1.mtdUpdateProc(map);
	    // 수정 완료 후 리스트 페이지로 리디렉션
	    return "redirect:/applyList";
	}
	

	
	
	// 지원서 DB 입력처리
	@GetMapping("/applyProc")
	public String applyProc(
			@RequestParam(value="userName") String userName,
			@RequestParam(value="userPhone") String userPhone,
			@RequestParam(value="applyPart") String applyPart,
			@RequestParam(value="applyMotive") String applyMotive,
			RedirectAttributes redAttr
			) {
		
		Map<String, String> map = new HashMap<>();
		map.put("userName", userName);
		map.put("userPhone", userPhone);
		map.put("applyPart", applyPart);
		map.put("applyMotive", applyMotive);
		
		service1.mtdRegProc(map);
		
		return "redirect:applyList";
	}
	
	
	// 내용 상세보기
	@RequestMapping("/view")
	public String result(
	        @RequestParam ("num") String num, 
	        Model model) {
//		int numParam = Integer.parseInt(num);
	    // ApplyDto 객체를 model에 추가
		try {
			model.addAttribute("applyDto",service1.applyDetail(num));
			
		} catch (Exception e) {
			return "error";
		}

	    return "view";
	}

	
	
	//지원 정보 리스트 출력
	@RequestMapping("/applyList")
	public String list(Model model) {
		model.addAttribute("mtdList",applyDao.mtdList());
		service1.mtdList();
		return "applyList";
	}
	
	


}