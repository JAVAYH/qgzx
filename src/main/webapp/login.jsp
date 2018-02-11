<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>Bootstrap 101 Template</title>
    <!-- Bootstrap -->
    <link href="<%=basePath%>/js/bootstrap-3.3.7/css/bootstrap.min.css"></link>
</head>
<body>
   <script type="text/javascript" src="<%=basePath%>/js/jquery/jquery.js"></script>
   <script type="text/javascript" src="<%=basePath%>/js/bootstrap-3.3.7/js/bootstrap.min.js"></script>
   <div align="center">
   	欢迎登陆
   <form method="post" action="<%=basePath%>/user/index.do" method="post">
   		<p>姓名:<input type="text" name="j_username" size="20"/></p>
   		<p>密码:<input type="password" name="j_password" size="20"/></p>
   		<p>
   			<input type="submit" value="确定"/>
   			<input type="reset" value="取消"/>
   		</p>
   </form>
   </div>
</body>
</html>