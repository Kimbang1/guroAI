package com.exam.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.exam.mybatis.dao.MemberDao;


@Controller
public class MemberController {
	
	@Autowired
	private MemberDao memberDao;
	
	@RequestMapping("/")
	public @ResponseBody String root() throws Exception {
		return "MyBatis Framework JDBC";
	}
	
	@RequestMapping("/memberList") 
	public String memberList(Model model) {
		model.addAttribute("memberList", memberDao.memberList());
		return "memberList";
	}
	

}





