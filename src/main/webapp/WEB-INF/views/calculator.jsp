<%--
  Created by IntelliJ IDEA.
  User: Surface Pro 4
  Date: 2018/10/25
  Time: 8:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cal</title>
</head>
<body>
<form method="post">
    <input type="text" name="operand1" placeholder="operand1">
    <input type="text" name="operand2" placeholder="operand2">
    <select name="operator">
        <option value="+">+</option>
        <option value="-">-</option>
        <option value="*">*</option>
        <option value="/">:</option>
    </select>
    <input type="submit" value="tính">
</form>
</body>
</html>
