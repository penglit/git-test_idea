<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'main.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/css.css">
	<script type="text/javascript">
		function myclick(){
			alert("aa");
			location="user.do?operate=toIndividualInfo";
			//location="/MyOASystem/user.do?operate=toIndividualInfo";
		}
	</script>
  </head>
  
  <body >
    <table cellpadding="0" cellspacing="0">
    	<tr><td> <span onclick="myclick()">内容</span><input type="button" value="提交" onclick="myclick()"></td></tr>
    </table>
  </body>
</html>
