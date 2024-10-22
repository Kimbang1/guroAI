package pkg.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.sql.ResultSet;
//import java.sql.Statement;

public class Main {
	//데이터 생성 = 데이터 입력
	
	
	private static Connection conn;
	// 무조건 필수 => DB연동(=연결해서 동작)
//	private static Statement stmt;
//	//Select에서 주로 사용함.
//	private static ResultSet rs;
//	//Select의 결과를 반환함.
	
	private static PreparedStatement pstmt;
	//?(물음표) 매개변수를 사용할 수 있음.
	// Insert, Update, Delete에 주로 사용함.
	

	public static void main(String[] args) {
		
		try {
			//1. DB연동
			Class.forName("oracle.jdbc.OracleDriver");		//리플렉션 = 반영해야함
			
			String url = "jdbc:oracle:thin:@//localhost:1521/xe";
			String uid = "test01";
			String upw = "1234";
			conn = DriverManager.getConnection( url ,uid, upw);	//접속 실행
							// 		DB경로 접속ID 접속PW
			int num =9;
			String code = "abcd1234";
			String name = "딸기";
			int price = 12000;
			String opt ="설향딸기";
			String makedate ="20240105";
			
			String sql = "insert into goodsList(num, code, name, price, opt, makedate) ";
					sql += " values(?, ?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.setString(2, code);
			pstmt.setString(3, name);
			pstmt.setInt(4, price);
			pstmt.setString(5, opt);
			pstmt.setString(6, makedate);
			
			int resultNum = pstmt.executeUpdate();
			
			if(resultNum == 1) {
				System.out.println("입력성공!");
			}else {
				System.out.println("데이터가 전달되지 않았습니다. 전송 실패!");
			}
			
		//System.out.println("정상 접속");
				
		} catch (ClassNotFoundException e) {
		
			System.out.println("CNFE 이슈 : "+ e.getMessage());
			
		} catch (SQLException e) {
			System.out.println("SQL 이슈 : "+ e.getMessage());
		}
	}

}
