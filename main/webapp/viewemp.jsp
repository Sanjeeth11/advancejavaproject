<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<tr>
<th>emp id</th>
<th>emp name</th>
</tr>

<c:forEach var ="emp" items="${list}">
<tr>
<td>${emp.id}</td>
<td>${emp.name}</td>
</tr>
</c:forEach>
</table>
</body>
</html>