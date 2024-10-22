package pkg;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int num2 = 0;
		try {
			
			System.out.println("예외(Exeption, 익셉션)");		
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("첫 번째 숫자를 입력하세요 : ");
			int num1 = scanner.nextInt();
			
			System.out.print("두 번째 숫자를 입력하세요 : ");
			 num2 = scanner.nextInt();
			
			scanner.close();
			//예외처리 시작 =>try{...} catch(){...} finally{...}
			
			System.out.println("입력 값 : " + (num1 / num2));
			
		} catch (ArithmeticException e) {
//			System.out.println("예외 처리 영역(catch 블록) 실행됨!");
						System.out.println("num2의 값 : " + num2);
		
		}catch (Exception e) { //Exception이 상위 오브젝트이기에 아래로 가야함
			
			
		}finally {//어떤 내용이더라도 무조건 출력하라 하는 것.
		
		}
			
			
		
		
		System.out.println("\n정상종료!");
	}

}
