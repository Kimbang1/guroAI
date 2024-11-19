package pack.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.oreilly.servlet.MultipartRequest;



public class DBConn {	//DAO (Access, 접속)
	
	//1. DB접속 담당
	//2. DB와의 CRUD
	
	private String url= "jdbc:mysql://localhost:3306/fileup?"
					  + "useSSL=false&"
					  + "useUnicode=true&"
					  + "characterEncoding=UTF8&" //해줘야 데이터 베이스에서 한글안깨짐
					  + "serverTimezone=UTC&"
					  + "allowPublicKeyRetrieval=true";
	//DB 접속 설정
 	
	private String uid = "root";
	private String pwd = "1234";
	
	//데이터 삽입 메서드
	public void insertFileEleent(MultipartRequest multiReq) {
		Connection conn =null;
	 	PreparedStatement pstmt = null;
	 	
	 	 try {
	            // JDBC 드라이버 로드
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            // 데이터베이스 연결
	            conn = DriverManager.getConnection(url, uid, pwd);

	            // SQL 쿼리 준비
	            String sql = "INSERT INTO FileEleent(name, uploadName, detail) VALUES (?, ?, ?)";
	            pstmt = conn.prepareStatement(sql);
	            
	            pstmt.setString(1,multiReq.getOriginalFileName("fileName"));
	            pstmt.setString(2,multiReq.getFilesystemName("fileName"));
	            pstmt.setString(3,multiReq.getParameter("content"));

	            // 데이터 삽입 실행
	            pstmt.executeUpdate();
	        } catch(ClassNotFoundException e){
	        
	        }catch(SQLException e){
	        }
	    }
}

