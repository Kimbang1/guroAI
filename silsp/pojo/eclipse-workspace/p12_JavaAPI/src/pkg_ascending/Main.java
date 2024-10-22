package pkg_ascending;

import java.util.Arrays;
import java.util.Scanner;


// try - catch 구문 => 예외처리 
// try - with - resource 또는 try - catch - resource 구분 
// => 생성된 객체의 자동 소멸을 목적
public class Main {

	public static void main(String[] args) {
	
		try(Scanner scanner = new Scanner(System.in);) {
			System.out.print("입력할 이메일 수 : ");
			int cnt = scanner.nextInt();   // cnt, count
			System.out.println();
			
			String[] strAry = new String[cnt];
			String email = "";
			String account = "";
			
			for (int i = 0; i < cnt; i++) {
				System.out.print((i+1)+"번 입력 : ");
				email = scanner.next();
				
				// @ 기호의 인덱스 번호 찾기
				int atIdx = email.indexOf("@"); 
				// idx, index 번호, @ => at Mark
				account = email.substring(0, atIdx);
				strAry[i] = account;
			}
			
			System.out.println("-----------------------------");
			
			Arrays.sort(strAry);
			System.out.println("오름차순 정렬 : \n" + Arrays.toString(strAry));
			
		} catch (Exception e) {
		
		}
		
		System.out.println("\nEnd");

	}

}
