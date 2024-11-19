<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.Context"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//데이터베이스 연결
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	try{
		//JNDI로 DataSource 가져오기
		Context init = new InitialContext();
		DataSource dataSource = (DataSource)init.lookup("java:comp/env/jdbc/dbcpConn");
		
		//커넥션 열기
		conn = dataSource.getConnection();
				
		String sql = "select num, goodsCode, goodsName, price, cnt From goodsList order by num desc";
		stmt = conn.createStatement();
		rs= stmt.executeQuery(sql);
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
		<h1>상품목록</h1>
		
		<main id = "main">
		<div id="haederRow" class="dataRow cloWid dFlex">
		<span>번호</span>
		<span>상품코드</span>
		<span>상품명</span>
		<span>가격</span>
		<span>재고</span>
		</div>
<%
	//결과 출력
	while(rs.next()){
%>
<div class="dataRow cloWid dFlex">
		<span><%=rs.getInt("num") %></span>
		<span><%=rs.getString("goodsCode") %></span>
		<span><%=rs.getString("goodsName") %></span>
		<span><%=rs.getInt("price") %></span>
		<span><%=rs.getInt("cnt") %></span>
		</div>
<%
	}
%>
		</main>
	</div>
	<!-- div#wrap -->
	<script src="/script/jquery-3.7.1.min.js"></script>
	<script src="/script/script.js"></script>
</body>
</html>    

<%
	}catch(Exception e){
		out.print("접속오류 :"+ e.getMessage());
	}finally{
		 try { if (rs != null) rs.close(); } catch (SQLException e) { System.out.print(e.getMessage()); }
	     try { if (stmt != null) stmt.close(); } catch (SQLException e) { System.out.print(e.getMessage()); }
	     try { if (conn != null) conn.close(); } catch (SQLException e) { System.out.print(e.getMessage()); }
	}
%>    


		
		
		