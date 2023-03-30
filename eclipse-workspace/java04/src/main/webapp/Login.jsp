<!--hw4A -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    String username = "";
    String password= "";
    String message= "";
    
    System.out.println("Started");
    
    if(request.getParameter("submit") != null){
    	  username = request.getParameter("username");
    	  password = request.getParameter("password");
    	  System.out.println("username: " + username);
    	  System.out.println("password: " + password);
    	  
    	 
    	 if((username.equals("godoro") ) && (password.equals("java") )){	
    		 session.setAttribute("username", username);
    		 response.sendRedirect("Home.jsp");
    		 System.out.println("Started Home");
    			 
    	 }else{
    		 System.out.println("Elseyteyim");
    		 out.print("Kullanıcı bulunamadı");
    	 } 	
    }
    
    %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action= "Login.jsp">
Kullanıcı adı giriniz: <input type= "text" name="username" value="<%=username%>" />
Şifrenizi giriniz: <input type= "text" name="password" value="<%=password %>" />
<input type= "submit" name="submit" value="Sakla" />

</form>


</body>
</html>