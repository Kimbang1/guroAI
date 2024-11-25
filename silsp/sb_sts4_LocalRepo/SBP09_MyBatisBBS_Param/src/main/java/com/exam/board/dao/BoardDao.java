package com.exam.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.exam.board.dto.BoardDto;

@Mapper
public interface BoardDao {
	
	// 전체 게시물 조회
	public List<BoardDto> mtdBoardList();
	
	// 특정 게시물 조회
	public BoardDto mtdBoardView(int num);
	
	// 게시글 입력
	public int mtdBoardWrite(@Param("_writer") String writer,@Param("_title") String title,@Param("_content") String content);
	
	// 게시글 삭제
	public int mtdBoardDelete(int num);

	public int mtdArticleCnt();

}