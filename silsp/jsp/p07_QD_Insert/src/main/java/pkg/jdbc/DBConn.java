package pkg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConn {
	
	private String url= "jdbc:mysql://localhost:3306/sampleData?"
					  + "useSSL=false&"
					  + "useUnicode=true&"
					  + "characterEncoding=UTF8&" //해줘야 데이터 베이스에서 한글안깨짐
					  + "serverTimezone=UTC&"
					  + "allowPublicKeyRetrieval=true";
	//DB 접속 설정
 	
	private String uid = "root";
	private String pwd = "1234";
	
	//데이터 삽입 메서드
	public void insertGoods(DataBean goods)throws ClassNotFoundException, SQLException{
		Connection conn =null;
	 	PreparedStatement pstmt = null;
	 	
	 	 try {
	            // JDBC 드라이버 로드
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            // 데이터베이스 연결
	            conn = DriverManager.getConnection(url, uid, pwd);

	            // SQL 쿼리 준비
	            String sql = "INSERT INTO goodsList(goodsCode, goodsName, price, cnt) VALUES (?, ?, ?, ?)";
	            pstmt = conn.prepareStatement(sql);
	            pstmt.setString(1, goods.getGoodsCode());
	            pstmt.setString(2, goods.getGoodsName());
	            pstmt.setInt(3, goods.getPrice());
	            pstmt.setInt(4, goods.getCount());

	            // 데이터 삽입 실행
	            pstmt.executeUpdate();
	        } finally {
	            // 자원 해제
	            if (pstmt != null) pstmt.close();
	            if (conn != null) conn.close();
	        }
	    }
	}
	
