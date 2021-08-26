<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Get Info</title>
</head>
<style>
td {
	width : 50px;
	height : 30px;
}
</style>
<body>
<!-- <form method="get" action="/app/info">
	유저id<input type=text name=userid><br>
	지역<input type=text name=address><br><br>
	<input type=submit value="전송">
</form> -->
<table border=1>
<%-- <%
	int k=1;
	for(int i=0;i<5;i++){
		out.println("<tr>");
		for(int j=0;j<4;j++){
			out.println("<td>"+k+"</td>");
			k++;
		}
		out.println("</tr>");
	}
%> --%>
<%!
	int k=1;
%>
<%
	for(int i=0;i<5;i++){
%>
<tr>
<%		
	for(int j=0;j<4;j++){
%>
<td><%= k %></td>
<%
			k++;
		}
%></tr>
<%
	}
%>
</table>
</body>
</html>