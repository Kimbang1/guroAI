package com.exam.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.exam.board.dto.BoardDto;



@Mapper
public interface BoardDao {
	public List<BoardDto> mtdBoardList();							//목록
	public BoardDto mtdBoardView(@Param("num") int num);							//내용보기	
	public int mtdBoardWrite(@Param("wrtier")String writer,
							 @Param("title")String title,
							 @Param("content")String content);		//글저장
	public int mtdBoardDelete(@Param("num")int num);								//글 삭제
}
