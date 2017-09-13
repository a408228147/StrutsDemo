<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/17
  Time: 9:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/register.do" method="post">
name:<input type="text" name="username"  /><br/>
    password:<input type="password"  name="password"/><br/>
    birth:<input type="text"  name="birthday"/><br/>
    hobby:<input type="checkbox" name="hobby" value="吃饭"/>吃饭
    <input type="checkbox" name="hobby" value="睡觉"/>睡觉
    <input type="checkbox" name="hobby" value="喝酒"/>喝酒<br/>
    married:<input type="checkbox" name="married" value="true" />
    <input type="checkbox" name="married" value="false" /><br/>
    <input type="submit" value="注册"/>
</form>
</body>
</html>
