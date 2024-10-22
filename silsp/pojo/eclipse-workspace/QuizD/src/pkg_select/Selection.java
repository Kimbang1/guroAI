package pkg_select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class Selection {
	//데이터 조회
	
	private static Connection conn;
	private static Statement stmt;
	private static ResultSet rs;
	
	
	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url = "jdbc:oracle:thin:@//localhost:1521/xe";
			String uid = "test02";
			String upw = "1234";
			conn = DriverManager.getConnection( url ,uid, upw);
			System.out.println("정상 접속?");
			
			stmt = conn.createStatement();
			String sql = "num, userid, username, yearRank, position"
				+ "from staff order by num desc";
			
			System.out.println("Num \t Userid \t Username \t yearRank \t position");
			System.out.println("-------------------------------------------------\n");
			
			while(rs.next()) {
				String str = rs.getInt("num") + "\t";
				str += rs.getString("userid") + "\t";
				str += rs.getString("username") + "\t";
				str += rs.getInt("yearRank") + "\t";
				str += rs.getString("position");
				
				System.out.println(str);
			}
			
			
			} catch (ClassNotFoundException e) {
				System.out.println("CNFE 이슈 : "+ e.getMessage());
		
		} catch (SQLException e) {
			System.out.println("SQL 이슈 : "+ e.getMessage());
			}
		
		
		
	}

}
