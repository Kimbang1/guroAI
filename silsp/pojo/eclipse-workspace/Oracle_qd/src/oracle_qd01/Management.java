package oracle_qd01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Management {
	private static PreparedStatement pstmt;
	private static Connection conn;
	private static Statement stmt;
	private static ResultSet rs;
	private static String sql = null;

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in);) {

			conn = dbConn();
			
			int num = 0;
			String userid = null;
			String username = null;
			int yearRank = 0;
			String position = null;

			while (true) {
				System.out.println("[ 사원관리 프로그램(v3) ]");
				String menuTxt = "1.사원목록  2.사원등록  3.직위수정  ";
				menuTxt += "4.퇴사처리  5.종료\n";
				System.out.println(menuTxt);
				System.out.print("메뉴를 선택하세요 : ");
				int menu = scanner.nextInt();

				if (menu == 1) {
					
					// 사원목록 보기
					mtdStaffList();
					

				} else if (menu == 2) {
					
					// 사원등록
					System.out.println("\n사원등록");
					System.out.println("--------------------");

					System.out.print("아이디를 입력하세요 : ");
					userid = scanner.next();
					System.out.print("이름을 입력하세요 : ");
					username = scanner.next();
					System.out.print("년차를 입력하세요 : ");
					yearRank = scanner.nextInt();
					System.out.print("직위를 입력하세요 : ");
					position = scanner.next();
					
					mtdStaffReg(userid, username, yearRank, position);   
					

				} else if (menu == 3) {
					// 직위수정
					System.out.print("\n수정할 직원의 아이디를 입력하세요 : ");
					userid = scanner.next();
//					System.out.println("userid : " + userid);
					System.out.print("수정할 직위를 입력하세요 : ");
					position = scanner.next();
//					System.out.println("position : " + position);

					mtdPositionUpdate(userid, position);
					
				} else if (menu == 4) {
					// 퇴사처리
					System.out.print("\n퇴사할 사원의 번호를 기재하세요 : ");
					num = scanner.nextInt();
					
					mtdWithdraw(num);
					
				} else if (menu == 5) {
					break;
				}
			}

		} catch (Exception e) {
			// System.out.println(e.getMessage());
		}

		System.out.println("\n사원관리 프로그램 종료!");

	}

	
	// 퇴사처리 시작
	private static void mtdWithdraw(int num) {

		try {
			sql = "delete from staff ";
			sql += "where num=?";

			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);

			int resultNum = pstmt.executeUpdate();

			System.out.println();
			if (resultNum == 1) {
				System.out.println("삭제완료!");
			} else {
				System.out.println("데이터가 전달되지 않았습니다. 전송 실패!");
			}
			System.out.println();
			
		} catch (SQLException e) {
			System.out.println("삭제이슈 : " + e.getMessage());
		}

		
	}
	// 퇴사처리 끝


	// 직위수정 시작
	private static void mtdPositionUpdate(String userid, String position) {

		try {
			sql = "update staff set position='" +position+"' ";
			sql += "where userid='"+userid+"'";
		
			pstmt = conn.prepareStatement(sql);

			int resultNum = pstmt.executeUpdate();

			System.out.println();
			if (resultNum == 1) {
				System.out.println("수정완료!");
			} else {
				System.out.println("데이터가 전달되지 않았습니다. 전송 실패!");
			}
			System.out.println();
			
		} catch (SQLException e) {
			System.out.println("수정이슈 : " + e.getMessage());
		}

	}
	// 직위수정 끝


	// 사원등록 시작 
	private static void mtdStaffReg(
			String userid, 
			String username, 
			int yearRank, 
			String position
			) {

		try {
			
			sql = "insert into staff (num, userid, username, yearRank, position) ";
			sql += "values (staffSeq.nextval, ?, ?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			pstmt.setString(2, username);
			pstmt.setInt(3, yearRank);
			pstmt.setString(4, position);

			int resultNum = pstmt.executeUpdate();

			System.out.println();
			if (resultNum == 1) {
				System.out.println("등록완료!");
			} else {
				System.out.println("데이터가 전달되지 않았습니다. 전송 실패!");
			}
			System.out.println();
			
		} catch (SQLException e) {
			// TODO: handle exception
		}

		
	}
	// 사원등록 끝


	// 사원목록 보기 시작
	private static void mtdStaffList() {
		
		try {
						
			System.out.println("\n사원목록");
			System.out.println("------------------------------");

			stmt = conn.createStatement();

			sql = "select num, userid, username, position " + "from staff order by num desc";
			rs = stmt.executeQuery(sql);

			System.out.println("Num \t 아이디 \t 이름 \t 직위 ");

			while (rs.next()) {
				String str = rs.getInt("num") + "\t";
				str += rs.getString("userid") + " ";
				str += rs.getString("username") + " ";
				str += rs.getString("position");
				System.out.println(str);
			}

			System.out.println();

			
		} catch (SQLException e) {
			// TODO: handle exception
		}
			
	}
	// 사원목록 보기 끝
	

	// DB 연동 메서드
	private static Connection dbConn() {

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@//localhost:1521/xe";
			String uid = "manager01";
			String upw = "1234";
			conn = DriverManager.getConnection(url, uid, upw);
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return conn;
	
	}

}
