package pkg_insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
	private static Connection conn;
	private static PreparedStatement pstmt;

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");

			String url = "jdbc:oracle:thin:@//localhost:1521/xe";
			String uid = "test02";
			String upw = "1234";
			conn = DriverManager.getConnection(url, uid, upw);

			String sql = "insert into staff(num,userid, username, yearRank,position) ";
			sql += " values(?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			int num = 0;
			String userid=" ";
			String username=" ";
			int yearRank=0;
			String position =" ";
			
			
			
			
			pstmt.setInt(1, num);
			pstmt.setString(2, userid);
			pstmt.setString(3, username);
			pstmt.setInt(4, yearRank);
			pstmt.setString(5, position);
			

			int resultNum = pstmt.executeUpdate();

			if (resultNum == 1) {
				System.out.println("입력성공!");
			} else {
				System.out.println("데이터가 전달되지 않았습니다. 전송 실패!");
			}
		} catch (ClassNotFoundException e) {

			System.out.println("CNFE 이슈 : " + e.getMessage());

		} catch (SQLException e) {
			System.out.println("SQL 이슈 : " + e.getMessage());
		}

	}

}
