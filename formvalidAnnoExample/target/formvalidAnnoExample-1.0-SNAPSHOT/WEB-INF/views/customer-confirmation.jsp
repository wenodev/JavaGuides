<%--
  Created by IntelliJ IDEA.
  User: whosegoodsdev
  Date: 2020-04-21
  Time: 오후 6:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
    <title>Customer Confirmation</title>
</head>

<body>

The customer is confirmed: ${customer.firstName} ${customer.lastName}

<br><br> Free passes: ${customer.freePasses}

<br><br> Email: ${customer.email}

<br><br> Postal Code: ${customer.postalCode}

</body>

</html>