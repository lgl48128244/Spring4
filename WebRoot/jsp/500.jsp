<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"
	isErrorPage="true"%>
<%
	response.setStatus(HttpServletResponse.SC_OK);
%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP '500.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	程序发生了错误，有可能该页面正在调试或者是设计上的缺陷.
	<br /> 你可以选择
	<br />
	<a href=<%=basePath + "jsp/new.jsp"%>>反馈</a> 提醒我 或者
	<br />
	<a href="javascript:history.go(-1)">返回上一页</a>
	<h2>
		<font color=#DB1260>JSP Error Page</font>
	</h2>

	<span>path:<%=path%></span>
	</br>
	<span>basePath:<%=basePath%></span>
	<div>系统执行发生错误，信息描述如下：</div>
	<div>错误状态代码是：${pageContext.errorData.statusCode}</div>
	<%--  <%=request.getAttribute("javax.servlet.error.status_code")%> --%>
	<div>请求URL：${pageContext.errorData.requestURI}</div>
	<%-- <%=request.getAttribute("javax.servlet.forward.request_uri")%> --%>
	<div>servlet：${pageContext.errorData.servletName}</div>
	<div>
		请求地址：<%=request.getAttribute("javax.servlet.forward.servlet_path")%></div>
	<h3>错误信息:</h3>
	<pre>
		${pageContext.exception}
		错误堆栈信息：
		<c:forEach var="trace" items="${pageContext.exception.stackTrace}">
			${trace}
		</c:forEach>
	</pre>
</body>
</html>
