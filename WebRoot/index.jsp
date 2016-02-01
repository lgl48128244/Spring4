<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript">
	function test() {
		var v = document.getElementById("digit");
		alert(v.value);
	}
	//test();
	function test1() {
		var d, s = "今天是星期：";
		d = new Date();
		s += d.getFullYear() + "-";
		s += d.getMonth() + "-";
		s += d.getDay();
		alert(s);
	}
</script>
</head>

<body>
	<button type="button" value="button" id="digit" />
	<input type="radio">
</body>
</html>
