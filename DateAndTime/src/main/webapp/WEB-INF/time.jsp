
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8" import="java.util.Date"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="/main.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
    Date currentDate = new Date();
%>

<p>The time is: <fmt:formatDate value="<%= currentDate %>" pattern=" HH:mm:ss" /></p></body>
</html>