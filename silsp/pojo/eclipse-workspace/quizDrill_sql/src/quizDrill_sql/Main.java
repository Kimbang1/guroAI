package quizDrill_sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

	private static Connection conn;
	// DB 접속(=연동)
	private static Statement stmt;
	// SQL 구문
	private static ResultSet rs;
	// Select 값 반환

	public static void main(String[] args) {
		
		try {
			// MySQL JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
		    // 데이터베이스 연결 설정
			String url = "jdbc:mysql://localhost:3306/comunity?";
					url+= "useSSL=false&";
		            url += "characterEncoding=utf8&";
		            url += "useUnicode=true&";
		            url += "serverTimezone=Asia/Seoul&";
		            url += "allowPublicKeyRetrieval=true";
			String uid ="root";
			String upw ="1234";
			// 데이터베이스 연결
			conn = DriverManager.getConnection(url,uid,upw);
			stmt = conn.createStatement();
			Scanner sc = new Scanner(System.in);
			int selectNum=0; 
			while(selectNum != 3) {
				
				//작업선택
				System.out.println("작업을 선택하세요.");
				System.out.println("1. 회원목록 보기 2. 회비내역 보기 3. 끝내기");
				System.out.print("번호 입력 :");	
				
				selectNum =sc.nextInt();
				
				if (selectNum == 1) {
					// 회원목록 출력
					String sql= "select seq, name, memID, tel, date_format(regTm,'%y-%m-%d') as regTm\r\n"
							+ "from memberList";
					rs= stmt.executeQuery(sql);
					
					System.out.println("번호\t 이름\t 회원ID\t 연락처\t 가입날짜");
					System.out.println("------------------------------------------");
					
					while(rs.next()) {
						int seq	= rs.getInt("seq");
						String name = rs.getString("name");
						String memID= rs.getString("memID");
						String tel= rs.getString("tel");
						String regTM= rs.getString("regTM");
						
						System.out.print(seq+"\t");
						System.out.print(name+"\t");
						System.out.print(memID+"\t");
						System.out.print(tel+"\t");
						System.out.println(regTM+"\t");
						
					}
				} else if (selectNum == 2) {
					// 회비 납부내역 출력
					String sql= "select clubFee.seq, memberList.name, clubFee.memID, clubFee.money, Date_format(payTM,'%y-%m-%d')as payTM\r\n"
							+ "from memberList \r\n"
							+ "inner join clubFee on memberList.memID = clubFee.memID \r\n"
							+ "order by clubFee.seq desc";
					rs= stmt.executeQuery(sql);
					
					System.out.println("번호\t 이름\t 회원ID\t 회비\t 납부일");
					System.out.println("---------------------------------------");
					
					while(rs.next()) {
						int seq	= rs.getInt("seq");
						String name = rs.getString("name");
						String memID= rs.getString("memID");
						int money= rs.getInt("money");
						String payTM= rs.getString("payTM");
						
						String formatteNumber = String.format("%,d",money);
						
						
						System.out.println(seq+"\t"+ name +"\t"+memID + "\t"+formatteNumber+"\t"+payTM);
					}
					
				} else {
					System.out.println("프로그램을 종료합니다.");
				}
				
			}
			sc.close();
	}catch(ClassNotFoundException e) {
		System.out.println("CNFE : " + e.getMessage());
	}catch(SQLException e) {
		 System.out.println("SQLE : " + e.getMessage());
	}
	}
	
}