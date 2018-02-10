<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/dateConvert.tld" prefix="ct" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试自定义标签</title>
</head>
<body>
<input type="text" name="name" value="以下是自定义标签现实的值"></br>
<ct:longStr longTime="1314842011312"/>
</body>
</html>