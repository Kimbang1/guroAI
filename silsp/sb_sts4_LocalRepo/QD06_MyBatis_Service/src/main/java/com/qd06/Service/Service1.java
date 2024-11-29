package com.qd06.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qd06.dao.ApplyDao;
import com.qd06.dto.applyDto;

@Service
public class Service1 {
	
	@Autowired
	private ApplyDao applyDao;
	
	//지원서 DB 입력 처리(지원서 등록)
	public void mtdRegProc(Map<String, String> map) {
		applyDao.mtdRegProc(map); 
		
	}
	
	//목록 출력
	public List<applyDto> mtdList(){
			return applyDao.mtdList();
	}
	
	
	//상세보기
	//+수정 입력 폼 시작 
	public applyDto applyDetail(String num) {
		return applyDao.applyDetail(num) ;
	}
	
	//지원서 수정 
	public void mtdUpdateProc(Map<String, String>map) {
		int i=applyDao.mtdUpdateProc(map);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@"+i);
	}
	
}
