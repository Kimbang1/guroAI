package pkg.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	//데이터 읽기 = 데이터 조회
	
	
	private static Connection conn;
	private static Statement stmt;
	private static ResultSet rs;

	public static void main(String[] args) {
		
		try {
			//1. DB연동
			Class.forName("oracle.jdbc.OracleDriver");		//리플렉션 = 반영해야함
			
			String url = "jdbc:oracle:thin:@//localhost:1521/xe";
			String uid = "test01";
			String upw = "1234";
			conn = DriverManager.getConnection( url ,uid, upw);	//접속 실행
							// 		DB경로 접속ID 접속PW
			//System.out.println("정상 접속");
			stmt = conn.createStatement();
			String sql = "select num, code, name, price, opt, makedate "
					+"from staff order by num desc";
			rs = stmt.executeQuery(sql);
			
			System.out.println("Num \t Code \t Name \t Price \t Opt \t Makedate");
			System.out.println("-------------------------------------------\n");
			
			while(rs.next()) {
				String str = rs.getInt("num") + "\t";
				str += rs.getString("code") + "\t";
				str += rs.getString("name") + "\t";
				str += rs.getInt("price") + "\t";
				str += rs.getString("opt") + "\t";
				str += rs.getString("makedate");
				
				System.out.println(str);
				
				
			}
			
			
		} catch (ClassNotFoundException e) {
		
			System.out.println("CNFE 이슈 : "+ e.getMessage());
			
		} catch (SQLException e) {
			System.out.println("SQL 이슈 : "+ e.getMessage());
		}
	}
}
