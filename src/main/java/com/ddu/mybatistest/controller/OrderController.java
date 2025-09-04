package com.ddu.mybatistest.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ddu.mybatistest.dao.OrderDao;
import com.ddu.mybatistest.dto.UserDto;

@Controller
public class OrderController {
	
	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping(value = "orderList")
	public String orderList(HttpServletRequest request, Model model) {
		
		OrderDao orderDao = sqlSession.getMapper(OrderDao.class);
		List<UserDto> list = orderDao.allUserOrderListDao(request.getParameter("userid"));
		
		return"orderList";
	}
}
