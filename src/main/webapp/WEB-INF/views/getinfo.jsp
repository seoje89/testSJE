<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Get Info</title>
</head>
<body>
<form method="get" action="/app/info">
	유저id<input type=text name=userid><br>
	지역<input type=text name=address><br><br>
	<input type=submit value="전송">
</form>
</body>
</html>