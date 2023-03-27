<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
int left= Integer.parseInt(request.getParameter("left"));
int right= Integer.parseInt(request.getParameter("right"));

int  sum= left + right;

%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 toplam: <%=sum%>
</body>
</html>