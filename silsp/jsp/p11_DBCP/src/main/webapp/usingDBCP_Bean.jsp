<%@page import="java.sql.SQLException"%>
<%@page import="pkg.dbcp.DBConn"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
Connection conn = null;
try{
	conn = DBConn.mtdGetConn();
	
	//CRU => Statement, ResultSet, PreparedStatement
}catch(Exception e){
	out.print(e.getMessage());	
}finally{
	try{if(conn != null) conn.close();} catch (SQLException e) {}
}
%>    
    
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	<link rel="stylesheet" href="/style/style.css?v">
</head>
<body>
	<div id="wrap">
		
	</div>
	<!-- div#wrap -->
	<script src="/script/jquery-3.7.1.min.js"></script>
	<script src="/script/script.js"></script>
</body>
</html>    