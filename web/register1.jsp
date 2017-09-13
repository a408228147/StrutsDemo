<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/17
  Time: 11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--导入Struts2的标签库--%>



<html>
<head>
    <title>用户注册，使用的是Struts2的标签</title>
</head>
<body>
<%--<s:actionerror/>--%><%-- 动作错误 --%>
<%--<s:fielderror/> --%><%-- 字段错误 --%>
<%-- struts2的form标签，它提供了和原始html表单标签几乎一致的属性
action：请求的地址  直接写动作名称。好像idea不能
method：请求方式 默认post
enctype:表单编码的MIME类型
--%>
<s:form action="register.do">
    <s:textfield name="username" label="用户名"/>
    <s:password name="password" label="密码"/>
    <s:textfield name="bithday" label="生日"/>
    <s:checkbox name="hobby" label="爱好"/>
    <s:checkbox name="married" label="married"/>
    <s:submit value="注册"/>
</s:form>

<%--<form action="${pageContext.request.contextPath}/register.do" method="post">
    name:<input type="text" name="username"  /><br/>
    password:<input type="password"  name="password"/><br/>
    birth:<input type="text"  name="birthday"/><br/>
    hobby:<input type="checkbox" name="hobby" value="吃饭"/>吃饭
    <input type="checkbox" name="hobby" value="睡觉"/>睡觉
    <input type="checkbox" name="hobby" value="喝酒"/>喝酒<br/>
    married:<input type="checkbox" name="married" value="true" />
    <input type="checkbox" name="married" value="false" /><br/>
    <input type="submit" value="注册"/>
</form>--%>
</body>
</html>
