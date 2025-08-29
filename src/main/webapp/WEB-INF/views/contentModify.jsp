<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 수정</title>
</head>
<body>
	<h2>게시글 수정</h2>
	<hr>

	<form action="contentModifyOk">
	<input type="hidden" name="bnum" value="${bnum }">
	제목 : <input type="text" name="btitle" value="${boardDto.btitle }"><br><br>
	글쓴이 : <input type="text" name="bname" value="${boardDto.bname }"><br><br>
	글내용 : <textarea rows="10" cols="50" name="bcontent">${boardDto.bcontent }</textarea><br><br>
	<input type="submit" value="수정 완료">
	</form><br>
	<a href="boardList">목록으로</a>
</body>
</html>