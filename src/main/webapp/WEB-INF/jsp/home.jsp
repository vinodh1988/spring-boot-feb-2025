<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1> Spring BOOT  and MVC Works !!!!!</h1>
  <h3><u>Developers</u></h3>
 <ul>
 <%
     String[] names=(String[])request.getAttribute("names");
    
   for(String name:names){
 %>
    <li> <%=name %></li>
 <% } %>
 </ul>
 
 Application State : <%out.println(request.getAttribute("adata")); %>
 Session State : <%out.println(request.getAttribute("sdata")); %>
</body>
</html>