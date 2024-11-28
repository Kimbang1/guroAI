package com.upload;

import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.upload.svc.UploadService;

import jakarta.servlet.http.HttpServletResponse;

@Controller // 서비스 컨트롤러가 없으면 메인 컨트롤러에서
			// 전부다 때려 박아서 만들기에
			// 업로드 관련된것을 분리해서 처리
public class UploadController {

	@Autowired
	UploadService upSvc;

	@RequestMapping("/")
	private @ResponseBody String root() {
		return "파일업로드의 이해!";
	}

	// 파일 입력양식
	@RequestMapping("/fileForm")
	private String fileForm() {
		return "/fileForm";
	}

	// 파일 업로드 실행
	@RequestMapping("/uploadProc")
	public String uploadProc(MultipartHttpServletRequest req, Model model) {

		List<String> list = upSvc.mtdUpload(req);
		model.addAttribute("list", list);
		return "result";
	}

	// 파일 다운로드
	@RequestMapping("/downloadProc")
	public void fileDownload(@RequestParam("oriName") String oriName, @RequestParam("sysName") String sysName,
			HttpServletResponse resp) throws IOException {

		String realPath = "E:\\spring/upload/";
//			파일저장경로

		byte[] fileByte = FileUtils.readFileToByteArray(new File(realPath + sysName));
		// build.gradle에서 dependencies 항목에
		// implementation 'commons-io:commons-io:2.7' 추가 후 Refresh Gradle Project
		String filename = URLEncoder.encode(oriName, "UTF-8");
		// 파일저장경로에 있는 파일을 다운로드할 때 원본 파일명 적용
		// 다운로드 응답 헤더설정(response header)
		resp.setContentType("application/octet-stream");
		resp.setContentLength(fileByte.length);
		resp.setHeader("Content-Disposition", "attachment;	filename=" + filename);
		resp.setHeader("Content-Transfer-Encoding", "binary");
		resp.getOutputStream().write(fileByte);
		resp.getOutputStream().flush();
		resp.getOutputStream().close();
	}

	// 파일 삭제
	@RequestMapping("/fileDelProc")
	public String fileDelet(@RequestParam("sysName") String sysName) {

		System.out.println("ehckr");
		String realPath = "E:\\spring/upload/"; // 파일저장경로
		File file = new File(realPath + sysName);
		if (file.exists())
			file.delete();
		return "redirect:/fileForm";
	}

}
