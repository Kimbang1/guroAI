package com.exam.basic.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.exam.basic.dto.BoardDto;

@Mapper
public interface BoardDao {
	
	public List<BoardDto> daoBoardList();
}
