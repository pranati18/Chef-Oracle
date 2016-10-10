<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>




 <c:if test="${message}!= null">
		<c:out value="${message}"/>
	</c:if>
	<br><br><br>
	<table align="center" bgcolor="rgb(175,187,201)" bordercolor="black" cellspacing="4" cellpadding="4">
		<tr>
			<th>Ingredient id</th>
			<th>Ingredient name</th>
			<th>Ingredient type</th>
			
		</tr>
		<c:forEach var="list1" items="${list1}">
		<c:forEach var="list2" items="${list2}">
		<c:forEach var="list3" items="${list3}">
		<c:forEach var="list4" items="${list4}">
			<tr>
				<td>${list1.inname}</td>
				<td>${list2.inname}</td>
				<td>${list3.inname}</td>
				<td>${list4.inname}</td>
				
				<td>
					<form action="Servlet" method="get">
						<input type="hidden" name="index" value="${list.iid}" /> <input
							type="submit" name="action" value="Delete Program">
					</form></td>
				<td>
					<form action="Servlet" method="get">
						<input type="hidden" name="iid"
							value="${list.iid}" /> <input type="hidden"
							name="inname" value="${list.inname}" /> <input
							type="hidden" name="intype"
							value="${list.intype}" /> 
							
							 <input type="submit" name="action" value="Update Program">
					</form></td>
			</tr>
			<br>
		</c:forEach>
		</c:forEach>
		</c:forEach>
		</c:forEach>
	</table>









</body>
</html>



