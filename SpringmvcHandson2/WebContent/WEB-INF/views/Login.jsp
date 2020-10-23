<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri ="http://www.springframework.org/tags/form"  %>
    <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form:form action="${pageContext.request.contextPath}/loggedin" method="POST" modelAttribute="user">
 UserName:<form:input path="userName" /><form:errors path="userName" cssClass="error"></form:errors><br>
 Password:<form:input path="password" /><form:errors path="password" cssClass="error"></form:errors><br>
 <input type="submit" value="submit">
 
 </form:form>
</body>
</html>