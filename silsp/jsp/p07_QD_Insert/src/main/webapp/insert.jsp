<%@page import="pkg.jdbc.DBConn"%>
<%@page import="pkg.jdbc.DataBean"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <!-- 해줘야 데이터 베이스에서 한글안깨짐-->   
    
 <%
 	//데이터 베이스 연결 및 SQL 실행을 위한 변수 선언
	Connection conn =null;
 	PreparedStatement pstmt = null;
 	
 	//폼으로부터 전달된 데이터 받기
 	request.setCharacterEncoding("UTF-8");
 	//request.setCharacterEncoding("UTF-8");해줘야 데이터 베이스에서 한글안깨짐
 	
 	String goodsCode = request.getParameter("goodsCode");
 	String goodsName = request.getParameter("goodsName");
 	int price = Integer.parseInt(request.getParameter("price"));
 	int cnt = Integer.parseInt(request.getParameter("count"));
 
 	
 	//DTO 객체 생성
 	DataBean goods = new DataBean(goodsCode, goodsName, price, cnt);
 	DBConn goodsDAO = new DBConn();
	
	
	try{
		//DAO를 통해 데이터 삽입
		goodsDAO.insertGoods(goods);
		out.print("접속 성공");			
	} catch (ClassNotFoundException e) {
        out.print("JDBC Driver를 찾을 수 없습니다: " + e.getMessage());
    } catch (SQLException e) {
        out.print("SQL 오류: " + e.getMessage());
    } finally {
       
    }
%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	<link rel="stylesheet" href="style/style.css?v">
</head>
<body>
	<div id="wrap">
	<form action="form.html">
		<h1>데이터 입력 완료</h1>
		<button id="retBtn">돌아가기</button>
		</form>
	</div>
	<!-- div#wrap -->
	<script src="/script/jquery-3.7.1.min.js"></script>
	<script>
	$(function(){
		$("#retBtn").click(function(){
			location.href="form.html";
		});
	});
	</script>
</body>
</html>    