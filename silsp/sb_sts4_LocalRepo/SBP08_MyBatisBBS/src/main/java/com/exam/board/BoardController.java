package com.exam.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exam.board.dao.BoardDao;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class BoardController {
	
	@Autowired
	private BoardDao boardDao;

	// 메이페이지 리퀘스트 맵핑
	@RequestMapping("/")
	public String root() throws Exception {
		return "redirect:boardList";
	}

	// 목록페이지 리퀘스트 맵핑
	@RequestMapping("/boardList")
	public String boardlist(Model model) {
		model.addAttribute("mtdBoardList", boardDao.mtdBoardList());
		return "boardList";
	}

	// 내용보기 리퀘스트 맵핑
	@RequestMapping("/boardView")
	public String boardView(HttpServletRequest req, Model model) {
		try {

			req.setCharacterEncoding("UTF-8");
			int num = Integer.parseInt(req.getParameter("num"));
			model.addAttribute("mtdBoardView", boardDao.mtdBoardView(num));
		} catch (Exception e) {
			e.getMessage();
		}
		return "boardView";
	}

	// 글 입력양식 리퀘스트 맵핑
	@RequestMapping("/boardWrite")
	public String boardWriter(HttpServletRequest req, Model model) {
		try {
			req.setCharacterEncoding("UTF-8");
			String writer = req.getParameter("writer");
			String title = req.getParameter("title");
			String content = req.getParameter("content");
			boardDao.mtdBoardWrite(writer, title, content);
		} catch (Exception e) {
			e.getMessage();
		}
		return "redirect:boardList";
	}

	// 글삭제 리퀘스트 맵핑
//	글삭제	리퀘스트	맵핑
	@RequestMapping("/boardDelete")
	public String boardDelete(HttpServletRequest req) {
		try {
			req.setCharacterEncoding("UTF-8");
			int num = Integer.parseInt(req.getParameter("num"));
			boardDao.mtdBoardDelete(num);
		} catch (Exception e) {
			e.getMessage();
		}
		return "redirect:boardList";
	}
}
