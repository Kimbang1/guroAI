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
 
 	
 	
 	

try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	String url= "jdbc:mysql://localhost:3306/sampleData?";
	url += "useSSL=false&";
	url += "useUnicode=true&";
	url += "characterEncoding=UTF8&"; //해줘야 데이터 베이스에서 한글안깨짐
	url += 	"serverTimezone=UTC&";
	url += "allowPublicKeyRetrieval=true";
	//DB 접속 설정
 	
	String uid = "root";
	String pwd = "1234";
	conn = DriverManager.getConnection(url,uid,pwd);
	
	
	String sql = "insert into goodsList(goodsCode, goodsName, price, cnt)";
	sql += " values(?,?,?,?)";
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1,goodsCode);
	pstmt.setString(2,goodsName);
	pstmt.setInt(3,price);
	pstmt.setInt(4,cnt);
	
	int retn = pstmt.executeUpdate();
		if(retn ==1){
			out.print("접속성공!");
		}else{
			out.print("입력실패!");
		}
	
	} catch (ClassNotFoundException e) {
        out.print("JDBC Driver를 찾을 수 없습니다: " + e.getMessage());
    } catch (SQLException e) {
        out.print("SQL 오류: " + e.getMessage());
    } finally {
        // 자원 해제
        try {
            if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            out.print("자원 해제 오류: " + e.getMessage());
        }
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