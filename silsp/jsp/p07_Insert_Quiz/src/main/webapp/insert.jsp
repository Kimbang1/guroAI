<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
 
 
 <%
	Connection conn =null;
 	PreparedStatement pstmt = null;
 	
 	//입력할 데이터
 	String title ="연습글입니다.";
 	String content="글내용 테스트";
 	String writer="테스터01";
 	

try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	String url= "jdbc:mysql://localhost:3306/insertQuiz?";
	url += "useSSL=false&";
	url += "useUnicode=true&";
	url += "characterEncoding=UTF8&";
	url += 	"serverTimezone=UTC&";
	url += "allowPublicKeyRetrieval=true";
	//DB 접속 설정
 	
	String uid = "root";
	String pwd = "1234";
	conn = DriverManager.getConnection(url,uid,pwd);
	
	
	String sql = "insert into bbs(title, content, writer)";
	sql += " values(?,?,?)";
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1,title);
	pstmt.setString(2,content);
	pstmt.setString(3,writer);
	
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