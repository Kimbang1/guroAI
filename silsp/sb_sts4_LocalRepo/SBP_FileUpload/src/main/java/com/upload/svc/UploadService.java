package com.upload.svc;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Service
public class UploadService {

	//파일 업로드
	public List<String> mtdUpload(MultipartHttpServletRequest req){
		
		MultipartFile multipartFile = req.getFile("fName");
		
		String writer=req.getParameter("writer");
		System.out.println("writer : "+writer);
		
		String upFile = multipartFile.getOriginalFilename();
		List<String> list = new ArrayList<>();
		
		try{
			if(!upFile.equals("")) {
				String oriName = null;
				String sysName = null;
				
				String realPath = "E:\\spring/upload/";
				
				File folder = new File(realPath);
				if(folder.isDirectory()==false) {
					folder.mkdirs();
				}
				oriName=upFile;
				sysName=System.currentTimeMillis() + oriName.substring(oriName.lastIndexOf("."));
				
				long fSize = multipartFile.getSize();
				
				File file = new File(realPath + sysName);
				multipartFile.transferTo(file);
				
				list.add(oriName);
				list.add(sysName);
				list.add(Long.toString(fSize));
				list.add(realPath);
				
				
				System.out.println("원본파일명 : "+ oriName);
				System.out.println("업로드파일명 : "+ sysName);
				System.out.println("파일크기 : "+ fSize);
				System.out.println("저장경로 : "+ realPath);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}
	
	@Value("${file.upload.dir}")
	private String realPath;
}
