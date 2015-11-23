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




<h3>=========</h3>

<script src="https://code.jquery.com/jquery-2.1.4.js"></script>

닉넴 : <input type="text" name="secId" id="secId"> ,
내용 : <input type="text" name="passwd" id="passwd">
<button onclick="submit()">전송!</button> <br />
<button onclick="submit2()">전송2! </button><br />
<button onclick="submit3()">전송3!</button><br />
<button onclick="submit4()">전송4! 그냥보기 </button><br />
<script>

  function submit(){
    var userInformationVO = { secId : $("#secId").val(), passwd : $("#passwd").val() };
    console.log("전송되는 정보", userInformationVO);

    $.ajax({
      type : 'POST',
      url : "/test.do",
      contentType: 'application/json',
      data : JSON.stringify( userInformationVO ),
      success : function(result) {
        console.log( result );
      },
      error : function ( result ){
        console.log( result );
      }
    });
  }

  function submit2(){
    var userInformationVO = { secId : $("#secId").val(), passwd : $("#passwd").val() };
    console.log("전송되는 정보", userInformationVO);

    $.ajax({
      type : 'POST',
      url : "test.do",
      dataType: 'JSON',
      data: userInformationVO,
      success : function(result) {
        console.log( result );
      },
      error : function ( result ){
        console.log( result );
      }
    });
  }

  function submit3(){
    var userInformationVO = { secId : $("#secId").val(), passwd : $("#passwd").val() };
    console.log("전송되는 정보", userInformationVO);

    $.ajax({
      type : 'POST',
      url : "test3.do",
      contentType: 'application/json',
      data : JSON.stringify( userInformationVO ),
      success : function(result) {
        console.log( result );
      },
      error : function ( result ){
        console.log( result );
      }
    });
  }

  function submit4(){
    var userInformationVO = { secId : $("#secId").val(), passwd : $("#passwd").val() };
    console.log("전송되는 정보", userInformationVO);

    $.ajax({
      type : 'POST',
      url : "test2.do",
      contentType: 'application/json',
      data : JSON.stringify( userInformationVO ),
      success : function(result) {
        console.log( result );
      },
      error : function ( result ){
        console.log( result );
      }
    });
  }

</script>


</body>
</html>