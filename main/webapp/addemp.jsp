<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri = "http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action ="save">
<table>

<tr>
<td>eid = </td>
<td><form:input path="id" /></td>
</tr>

<tr>
<td>ename = </td>
<td><form:input path="name" /></td>
</tr>

<tr>
<td></td>
<td><input type = "submit" value ="save"/></td>
</tr>

</table>
</form>

</body>
</html>