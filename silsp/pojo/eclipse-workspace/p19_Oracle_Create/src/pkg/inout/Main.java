package pkg.inout;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

	private static PreparedStatement pstmt;
	private static Connection conn;
	private static Statement stmt;
	private static ResultSet rs;

	public static void main(String[] args) {

		// 1.입력에는 Scanner 적용
		// 2.입출력을 모두 구현
		System.out.println("OJDBC를 활용한 입출력 프로그램 구현");
		System.out.println("------------------------------------\n");

		int num = 0;
		String code = null;
		String name = null;
		int price = 0;
		String opt = null;
		String makedate = null;
		try (Scanner sc = new Scanner(System.in);) {

			System.out.print("번호입력 :");
			num = sc.nextInt();
			System.out.print("코드입력 :");
			code = sc.next();
			System.out.print("상품명 입력 :");
			name = sc.next();
			System.out.print("가격 입력:");
			price = sc.nextInt();
			System.out.print("옵션 입력 :");
			opt = sc.next();
			System.out.print("제조일 입력 :");
			makedate = sc.next();

			sc.close();

		} catch (Exception e) {
			System.out.println("입력이슈 : " + e.getMessage());
		}
		// Scanner를 사용한 데이터 입력 끝!

		// OJDBC 시작
		try {
			// 1. DB연동
			Class.forName("oracle.jdbc.OracleDriver"); // 리플렉션 = 반영해야함
			String url = "jdbc:oracle:thin:@//localhost:1521/xe";
			String uid = "test01";
			String upw = "1234";
			conn = DriverManager.getConnection(url, uid, upw);
//			System.out.println("접속 성공!!");

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

			if (resultNum == 1) {
				System.out.println("입력성공!");
			} else {
				System.out.println("데이터가 전달되지 않았습니다. 전송 실패!");
			}
			System.out.println("------------------------------------\n");
			System.out.println("현재 데이터 출력");

			
			stmt = conn.createStatement();
			sql = "select num, code, name, price, opt, makedate "
			+ "from goodsList order by num desc";//asc 면 반대로 출력
			rs = stmt.executeQuery(sql);

			System.out.println("Num \t Code \t Name \t Price \t Opt \t Makedate");
			System.out.println("-------------------------------------------\n");

			while (rs.next()) {
				String str = rs.getInt("num") + "\t";
				str += rs.getString("code") + "\t";
				str += rs.getString("name") + "\t";
				str += rs.getInt("price") + "\t";
				str += rs.getString("opt") + "\t";
				str += rs.getString("makedate");

				System.out.println(str);

			}

		} catch (ClassNotFoundException e) {

			System.out.println("CNFE 이슈 : " + e.getMessage());

		} catch (SQLException e) {
			System.out.println("SQL 이슈 : " + e.getMessage());
		}
		
			System.out.println("끝");
		
	}

}
