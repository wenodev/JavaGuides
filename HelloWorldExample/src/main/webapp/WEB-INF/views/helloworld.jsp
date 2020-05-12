<%--
  Created by IntelliJ IDEA.
  User: whosegoodsdev
  Date: 2020-04-21
  Time: 오후 12:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <%@ page isELIgnored="false" %>
    <meta charset="ISO-8859-1">
    <title>Spring 5 MVC - Hello World Example | javaguides.net</title>
</head>
<body>
    <h2>${helloWorld.message}</h2>
    <h4>Server date time is : ${helloWorld.dateTime}</h4>
</body>
</html>
