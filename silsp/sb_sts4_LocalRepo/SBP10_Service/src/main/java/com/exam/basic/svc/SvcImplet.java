package com.exam.basic.svc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.basic.dao.BoardDao;
import com.exam.basic.dto.BoardDto;

@Service
public class SvcImplet implements SvcInface {

	@Autowired
	private BoardDao boardDao;
	
	@Override
	public List<BoardDto> svcList() {
		
		return boardDao.daoBoardList();
	}
}




