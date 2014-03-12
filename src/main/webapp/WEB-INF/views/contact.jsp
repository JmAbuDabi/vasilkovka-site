<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf8">
	<title>Vasyha</title>
</head>
<body>

<a href="<c:url value="/logout" />">
	<spring:message code="label.logout" />
</a>
  
<h2><spring:message code="label.error" /></h2>

<form:form method="post" action="add" commandName="contact">

	<table>
		<tr>
			<td><form:label path="firstname">
				Name:
			</form:label></td>
			<td><form:input path="firstname" /></td>
		</tr>
		<tr>
			<td><form:label path="lastname">
				LastName:
			</form:label></td>
			<td><form:input path="lastname" /></td>
		</tr>
		<tr>
			<td><form:label path="email">
				Mail:
			</form:label></td>
			<td><form:input path="email" /></td>
		</tr>
		<tr>
			<td><form:label path="telephone">
				Phone:
			</form:label></td>
			<td><form:input path="telephone" /></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit"
				value="Add" /></td>
		</tr>
	</table>
</form:form>

<h3>ContactList</h3>
<c:if test="${!empty contactList}">
	<table class="data">
		<tr>
			<th>FN:</th>
			<th>LN:</th>
			<th>Phone:</th>
			<th>&nbsp;</th>
		</tr>
		<c:forEach items="${contactList}" var="user">
			<tr>
				<td>${user.lastname}, ${user.firstname}</td>
				<td>${user.email}</td>
				<td>${user.telephone}</td>
				<td><a href="delete/${user.id}">delete user</a></td>
			</tr>
		</c:forEach>
	</table>
</c:if>

</body>
</html>