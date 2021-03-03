<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	Home Page
<form action="home" method="get">
			<div>
				<button class="btn btn-outline-secondary" type="submit" name="action" value="SEARCH"
					id="button-addon1">Search</button>
				
				<input type="text" class="form-control" name="txteid"
					placeholder="Enter Student ID">
				
			</div>
			
		</form>
	<table >
			<thead>
				<tr >
				    <th >ID</th>
					<th >FNAME</th>
					<th >LNAME</th>
					<th >GRADE</th>
				
					<th colspan="2">Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="stu" items="${stulist}">
					<tr>
						<td><c:out value="${stu.student_id}"></c:out></td>
						<td><c:out value="${stu.student_fname}"></c:out></td>
						<td><c:out value="${stu.student_lname}"></c:out></td>
						<td><c:out value="${stu.student_grades}"></c:out></td>
						<td><a href="delete?id=${stu.student_id}">delete</a></td>
						<td><a href="edit?id=${stu.student_id}&fname=${stu.student_fname}&lname=${stu.student_lname}&grades=${stu.student_grades}">edit</a></td>
					
					</tr>
				</c:forEach>
			</tbody>
		</table>
</body>
</html>