<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<title> Happy WOrld </title>
</head>
<body>

social info : ${socialInfo} <Br>

hello world <br>

message : ${message } <br>

db driver : ${dbDriver } <Br>

JSP에서 직접 불러오기 : <spring:eval expression="@myXmlProps['db.driver']" /> <Br>

</body>
</html>