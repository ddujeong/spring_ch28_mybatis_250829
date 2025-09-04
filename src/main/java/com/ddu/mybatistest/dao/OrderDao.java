package com.ddu.mybatistest.dao;

import java.util.List;

import com.ddu.mybatistest.dto.UserDto;

public interface OrderDao {
	
	// tiger(userid)가 주문한 리스트 를 보여주는 메서드
	public List<UserDto> allUserOrderListDao(String userid); 
}
