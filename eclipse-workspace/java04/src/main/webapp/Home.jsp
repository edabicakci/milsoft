<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% 

String username = (String) session.getAttribute("username");

if(username != null){
	out.print("Hoşgeldin " + username );
	
	
}else{
	response.sendRedirect("Login.jsp");
}

if(request.getParameter("logout")!= null){
	response.sendRedirect("Logout.jsp");
}


%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form>
<input type="submit" name= "logout" value="Çık"/>
</form>


</body>
</html>