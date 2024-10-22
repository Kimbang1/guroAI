package p18_JDBC_Select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");

			String url = "jdbc:oracle:thin:@//localhost:1521/xe";
			String uid = "test02";
			String pwd = "1234";
			
			conn = DriverManager.getConnection(url, uid, pwd);
		
			System.out.println("접속 성공! OK!!");
			
			stmt = conn.createStatement();

			String sql = "select * from sample";
			rs = stmt.executeQuery(sql);

			while(rs.next()) {
				
				System.out.println("번호 : " + rs.getInt("num"));
				System.out.println("아이디 : " + rs.getString("userId"));
				System.out.println("비밀번호 : " + rs.getString("userpw"));
				System.out.println("이름 : " + rs.getString("username"));
				System.out.println("시간 : " + rs.getString("nowtm"));
				
			};

		} catch (ClassNotFoundException e) {
			
			System.out.println("접속 JDBC 이슈" + e.getMessage());
			
		} catch (SQLException e) {
			
			System.out.println("SQL 관련 이슈" + e.getMessage());
			
		}
		System.out.println("끝.");

	}

}
