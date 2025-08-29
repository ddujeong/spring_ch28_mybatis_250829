package com.ddu.mybatistest.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ddu.mybatistest.dao.IDao;
import com.ddu.mybatistest.dto.BoardDto;

@Controller
public class BoardController {
	@Autowired
	private SqlSession sqlSession; //DI(의존성 자동 주입)
	
	//@Autowired
	//private BoardService boardService;
	
	@RequestMapping(value = "/boardList")
	public String boardList(Model model) {
		
		IDao iDao = sqlSession.getMapper(IDao.class);
		List<BoardDto> boardDtos = iDao.boardListDao();
		int bcount = iDao.contentCountDao();
		//int bcount = boardService.getBoardCount();
		
		model.addAttribute("bcount", bcount);
		model.addAttribute("boardDtos",boardDtos);
		
		return "boardList";
	}
	@RequestMapping(value = "/boardWrite")
	public String boardWrite(HttpServletRequest request , Model model) {
		
		return "boardWrite";
	}
	@RequestMapping(value = "/boardWriteOk")
	public String boardWriteOk(HttpServletRequest request , Model model) {
		
		IDao iDao = sqlSession.getMapper(IDao.class);
		iDao.boardWriteDao(request.getParameter("btitle"),request.getParameter("bname"),request.getParameter("bcontent"));
		
		return "redirect:boardList";
	}
	@RequestMapping(value = "/contentView")
	public String contentView(HttpServletRequest request , Model model) {
		
		IDao iDao = sqlSession.getMapper(IDao.class);
		iDao.upBhitDao(Integer.parseInt( request.getParameter("bnum")));
		BoardDto boardDto = iDao.contentViewDao(Integer.parseInt( request.getParameter("bnum")));
		
		
		model.addAttribute("boardDto",boardDto);
		
		return "contentView";
	}
	@RequestMapping(value = "/contentDelete")
	public String contentDelete(HttpServletRequest request , Model model) {
		
		return "contentDelete";
	}
	@RequestMapping(value = "/deleteOk")
	public String deleteOk(HttpServletRequest request , Model model) {
		IDao iDao = sqlSession.getMapper(IDao.class);
		int result = iDao.contentDeleteDao(Integer.parseInt(request.getParameter("bnum")));
		
		if(result == 0) {
			model.addAttribute("error" ,result);
		}
		
		return "redirect:boardList";
	}
	@RequestMapping(value = "/contentModify")
	public String contentModify(HttpServletRequest request , Model model) {
		
		IDao iDao = sqlSession.getMapper(IDao.class);
		int bnum = Integer.parseInt(request.getParameter("bnum"));
		BoardDto boardDto = iDao.contentViewDao(bnum);
		
		model.addAttribute("bnum", bnum);
		model.addAttribute("boardDto",boardDto);
		
		return "contentModify";
	}
	@RequestMapping(value = "/contentModifyOk")
	public String contentModifyOk(HttpServletRequest request , Model model) {
		int bnum = Integer.parseInt(request.getParameter("bnum"));
		IDao iDao = sqlSession.getMapper(IDao.class);
		iDao.contentModifyDao(bnum, request.getParameter("btitle"),request.getParameter("bname"),request.getParameter("bcontent"));
		
		return "redirect:contentView?bnum=" + bnum;
	}
}
