<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<c:if  test="${ !empty nom }"><p>
<c:out value="Bonjour , vous vous appelez ${nom }"/></p></c:if>


<form method="post" action="bonjour">
<label for="nom"> name :</label>
<input type="text"  name="nom" id="nom"/>
<input type="submit"/>

</form>



</body>
</html>