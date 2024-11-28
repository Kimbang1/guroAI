package com.qd04.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ApplyDao {
	
	public void mtdRegProc(Map<String, String> map);

}