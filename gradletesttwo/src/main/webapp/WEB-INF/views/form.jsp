<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title> Happy WOrld </title>
</head>
<body>
<form action="${pageContext.request.contextPath}/valid" method="post">
<input type="text" name="secId" />
<input type="text" name="passwd" />
<input type="submit" value="확인"/>
</form>

</body>
</html>