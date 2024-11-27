package com.exam.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.exam.mybatis.dto.MemberDto;

@Mapper
public interface MemberDao {
	List<MemberDto> memberList();
	
	
}
