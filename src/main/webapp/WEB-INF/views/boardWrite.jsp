<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 작성</title>
</head>
<body>
	<h2>글 쓰기</h2>
	<hr>
	<form action="boardWriteOk">
	제목 : <input type="text" name="btitle" ><br><br>
	글쓴이 : <input type="text" name="bname"><br><br>
	글내용 : <textarea rows="10" cols="50" name="bcontent"></textarea><br><br>
	<input type="submit" value="글 작성">
	</form><br>
	<a href="boardList">목록으로</a>
</body>
</html>