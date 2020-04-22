<%--
  Created by IntelliJ IDEA.
  User: whosegoodsdev
  Date: 2020-04-21
  Time: 오후 4:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <title>javaguides.net</title>

</head>
<body>
<div class="container">
    <div class="col-md-offset-2 col-md-7">
        <h1>${message}</h1>
        <hr />

        <table class="table table-striped table-bordered">
            <tr>
                <td><b>First Name </b>: ${user.firstName}</td>
            </tr>
            <tr>
                <td><b>Last Name </b> : ${user.lastName}</td>
            </tr>
            <tr>
                <td><b>UserName </b> : ${user.userName}</td>
            </tr>
            <tr>
                <td><b>Email </b>: ${user.email}</td>
            </tr>
        </table>
    </div>
</div>
</body>
</html>