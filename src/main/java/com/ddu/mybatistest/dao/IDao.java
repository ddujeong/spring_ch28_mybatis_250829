package com.ddu.mybatistest.dao;

import java.util.List;

import com.ddu.mybatistest.dto.BoardDto;

public interface IDao {
	
	// 모든 글 리스트 불러오기 추상 메서드 선언
	public List<BoardDto> boardListDao();
	
	// 게시판 글 쓰기 추상 메서드 선언
	public void boardWriteDao(String btitle, String bname, String bcontent);
	//public void boardWriteDao(@Param("btitle") String btitle, @Param("bname") String bname, @Param("bcontent") String bcontent);
	
	// 게시판 글 확인 추상 메서드 선언
	public BoardDto contentViewDao(int bnum);
	
	// 게시판 글 수정 추상 메서드 선언
	public void contentModifyDao(int bnum, String btitle, String bname, String bcontent);
	
	// 게시판 글 삭제 추상 메서드 선언
	public int contentDeleteDao(int bnum);

	// 게시판 글 갯수 추상 메서드 선언
	public int contentCountDao();
	
	// 게시판 글 갯수 추상 메서드 선언
	public void upBhitDao(int bnum);
}
 