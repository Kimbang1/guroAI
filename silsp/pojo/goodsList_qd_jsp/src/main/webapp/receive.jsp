<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="EUC-KR">
<title>리시브</title>
</head>
<body>
<%
String id =request.getParameter("gCode");		//상품코드 파라미터
String name =request.getParameter("gName");		//상품명 파라미터
String price =request.getParameter("price");	//가격 파라미터



out.print("상품코드:"+id+"<br>");
out.print("상품명:"+name+"<br>");
out.print("가격:"+price+"<br>");

try {
	Connection conn;
	PreparedStatement pstmt;
	
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url = "jdbc:mysql://localhost:3306/stock_Mgr?";
	url += "useSSL=false&";
	url += "useUnicode=true&";
	url += "characterEncoding=UTF8&";
	url += "serverTimezone=Asia/Seoul&";
	url += "allowPublicKeyRetrieval=true";
	String uid = "root";
	String upw = "1234";
	
	conn = DriverManager.getConnection(url, uid, upw);
	
//	System.out.println("Company 접속 OK!!");
	
	String sql = "insert into goodsList";
	sql += "(gCode, gName, price)";
	sql += "values (?, ?, ?)";
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, id);
	pstmt.setString(2, name);
	pstmt.setString(3, price);
	
	
	int rtnCnt = pstmt.executeUpdate();   // return count
	
	if(rtnCnt == 1) {
		System.out.println("입력 완료!");
	} else {
		System.out.println("입력 실패했습니다. 다시 입력해주세요!");
	}
	
	
} catch(ClassNotFoundException e) {
	System.out.println("CNFE : " + e.getMessage());
} catch(SQLException e) {
	System.out.println("SQLE : " + e.getMessage());
}
%>

<button type="button" onclick="location.href='List.jsp'">상품목록으로 가기</button>
</body>
</html>