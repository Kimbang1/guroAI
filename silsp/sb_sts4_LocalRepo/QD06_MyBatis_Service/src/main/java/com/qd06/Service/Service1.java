package com.qd06.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qd06.dao.ApplyDao;

@Service
public class Service1 {

	@Autowired
	private ApplyDao applyDao;
	
	
}
