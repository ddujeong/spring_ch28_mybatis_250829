package com.ddu.mybatistest.dao;

import java.util.List;

import com.ddu.mybatistest.dto.BoardDto;

public interface IDao {
	
	// 모든 글 리스트 불러오기 추상 메서드 선언
	public List<BoardDto> boardListDao();
}
