package com.qd06.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.qd06.dto.applyDto;

@Mapper
public interface ApplyDao {
	
	//지원 정보 리스트
	public List<applyDto> mtdList();
	
	
	//지원서 등록
	public void mtdRegProc(Map<String, String> map);
	
	//applyselect상세보기
	public applyDto applyDetail(String num);
	
	//지원서 수정 
	public void mtdUpdateProc(Map<String, String>map);
	

}