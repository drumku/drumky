<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>    
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body> 
	<form>
		<table width="100%" border=1>
            <c:forEach items="${list}" var="account">
			<tr>
				<td>用户名</td>
				<td>${account.name} </td>
			</tr>
			<tr>
				<td>账户余额</td>
				<td> ${account.money} </td>
			</tr>
            </c:forEach>
		</table>
	</form>
</body>
</html>