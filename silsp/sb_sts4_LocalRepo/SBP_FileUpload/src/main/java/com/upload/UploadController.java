package com.upload;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.upload.svc.UploadService;

@Controller
public class UploadController {
	
	@Autowired
	UploadService upSvc;
	
	@RequestMapping("/")
	private @ResponseBody String root() {
		return"파일업로드의 이해!";
	}
	//파일 입력양식
	@RequestMapping("/fileForm")
	private String fileForm() {
		return"/fileForm";
	}
	//파일 업로드 실행
	@RequestMapping("/uploadProc")
	public String uploadProc(MultipartHttpServletRequest req, Model model) {
		
		List<String> list=upSvc.mtdUpload(req);
		model.addAttribute("list", list);
		return"result";
	}
}
