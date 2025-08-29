package com.ddu.mybatistest.controller;

import java.util.List;

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
	
	@RequestMapping(value = "/boardList")
	public String boardList(Model model) {
		
		IDao iDao = sqlSession.getMapper(IDao.class);
		List<BoardDto> boardDtos = iDao.boardListDao();
		
		model.addAttribute("boardDtos",boardDtos);
		
		return "boardList";
	}
}
