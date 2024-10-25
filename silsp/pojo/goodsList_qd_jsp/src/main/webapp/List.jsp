<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>상품목록</title>
<style>
div#wrap {
	width: 400px;
	padding: 20px;
	border: 2px solid #08f;
	margin: 10px auto;
}

div#inputArea {
	width: 100%;
	display: felx;
}

div#btnArea {
	font-weight: bord;
}
</style>
</head>
<body>
	<div id="wrap">
		<div id="list">
		<table>
         <tbody>
            <tr>
               <th>번호</th>
               <th>상품코드</th>
               <th>상품명</th>
               <th>가격</th>
               <th>등록일</th>
               <th>삭제</th>
            </tr>
            <%
            Connection conn;
            // DB 접속(=연동)
            Statement stmt;
            // SQL 구문
            ResultSet rs;
            // Select 값 반환
            
            try {
               Class.forName("com.mysql.cj.jdbc.Driver");
               
               String url = "jdbc:mysql://localhost:3306/stock_Mgr?";
                     url += "useSSL=false&";
                     url += "characterEncoding=utf8&";
                     url += "useUnicode=true&";
                     url += "serverTimezone=Asia/Seoul&";
                     url += "allowPublicKeyRetrieval=true";
               String uid = "root";
               String upw = "1234";
               
               conn = DriverManager.getConnection(url, uid, upw);
               
               stmt = conn.createStatement();
               
               String sql = "select * from goodsList order by num desc";
               rs = stmt.executeQuery(sql);		
               
               while(rs.next()) {
                  int num = rs.getInt("num");
                  String gCode = rs.getString("gCode");
                  String gName = rs.getString("gName");
                  int price = rs.getInt("price");
                  Timestamp regTime = rs.getTimestamp("regTM");
                  String regTM = regTime.toString();
                  out.print("<tr><td>" + num + "</td>");
                  out.print("<td>" + gCode + "</td>");
                  out.print("<td>" + gName + "</td>");
                  out.print("<td>" + price + "</td>");
                  out.print("<td>" + regTM.substring(0, 10) + "</td>");
                  out.print("<td class = 'delBtn' data-num = '" + num + "'>X</td></tr>");
               }
               
      //         System.out.println("MySQL Company DB 접속 성공!!!");
               
            } catch (ClassNotFoundException e) {
               System.out.println("CNFE : " + e.getMessage());
            } catch (SQLException e) {
               System.out.println("SQLE : " + e.getMessage());
            }
            
            %>
         </tbody>
      </table>
		</div>
		
		<button type="button" id="offerBtn">상품등록</button>
	</div>
	<script>
	btnDom = document.querySelector("#offerBtn");
	
	btnDom.addEventListener("click",()=>{
		
		window.location.href="insertGoods.html";
		
	
	});
</script>
</body>
</html>