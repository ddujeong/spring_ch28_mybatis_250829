<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 보기</title>
</head>
<body>
	<h2>게시글 내용</h2>
	<hr>
	작성자 : ${boardDto.bname} | 조회수 : ${boardDto.bhit } | 작성일 : ${boardDto.bdate } <br><br>
	
	제목 : ${boardDto.btitle} <br><br>
	
	내용 : ${boardDto.bcontent}<br><br>
	
	<a href="boardList" >목록으로</a>
	<a href="contentModify?bnum=${boardDto.bnum }">수정</a>
	<a href="deleteOk?bnum=${boardDto.bnum}">삭제</a>
	
</body>
</html>