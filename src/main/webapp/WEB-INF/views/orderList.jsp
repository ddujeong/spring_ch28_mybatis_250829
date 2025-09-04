<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 목록</title>
</head>
<body>
	<h2>게시판 글 목록</h2>
	총 게시글 수 <b style="color: green;"> [${bcount }] </b>개
	<hr>
	<a href="boardWrite">글 작성</a> |
	<a href="contentDelete">글 삭제</a><br><br>
	글번호 / 글제목 / 글쓴이 / 조회수 / 등록일 <br><br>
	<c:forEach var="bDto" items="${boardDtos }">
	${bDto.bnum } / <a href="contentView?bnum=${bDto.bnum }"> ${bDto.btitle }</a> / ${bDto.bname } / ${bDto.bhit } / ${bDto.bdate } <br><br>
	</c:forEach>
	
</body>
</html>