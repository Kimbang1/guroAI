package pkg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class select {
   // private int num;    // 필드
   
   private static Connection conn;
   // DB 접속(=연동)
   private static Statement stmt;
   // SQL 구문
   private static ResultSet rs;
   // Select 값 반환
   
   public static void main(String[] args) {
      // int test;      // 지역변수
      
      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         
         String url = "jdbc:mysql://localhost:3306/company?";
               url += "useSSL=false&";
               url += "characterEncoding=utf8&";
               url += "useUnicode=true&";
               url += "serverTimezone=Asia/Seoul&";
               url += "allowPublicKeyRetrieval=true";
         String uid = "root";
         String upw = "1234";
         
         conn = DriverManager.getConnection(url, uid, upw);
         
         stmt = conn.createStatement();
         
         String sql = "select * from staffList order by num desc";
         rs = stmt.executeQuery(sql);
         
         System.out.println("번호\t 아이디\t 이름\t 나이\t 주소");
         System.out.println("------------------------------------");
         
         while(rs.next()) {
            int num = rs.getInt("num");
            String id = rs.getString("id");
            String name = rs.getString("name");
            int age = rs.getInt("age");
            String address = rs.getString("address");
            System.out.print(num + "\t");
            System.out.print(id + "\t");
            System.out.print(name + "\t");
            System.out.print(age + "\t");
            System.out.println(address + "\t");
         }
         
//         System.out.println("MySQL Company DB 접속 성공!!!");
         
      } catch (ClassNotFoundException e) {
         System.out.println("CNFE : " + e.getMessage());
      } catch (SQLException e) {
         System.out.println("SQLE : " + e.getMessage());
      }
   }

}
