<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%
	Connection conn =null;

try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	String url= "jdbc:mysql://localhost:3306/Company?";
	url += "useSSL=false&";
	url += "useUnicode=true&";
	url += "characterEncoding=UTF8&";
	url += 	"serverTimezone=UTC&";
	url += "allowPublicKeyRetrieval=true";
	//DB 접속 설정
 	
	String uid = "root";
	String pwd = "1234";
	conn = DriverManager.getConnection(url,uid,pwd);
	
	out.print("접속성공!");
}catch(ClassNotFoundException e){
	out.print(e.getMessage());
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