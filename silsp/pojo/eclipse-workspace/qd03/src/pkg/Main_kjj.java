package pkg;

import java.util.Scanner;

public class Main_kjj {

	public static void main(String[] args) {
		
		
		try (Scanner scanner = new Scanner(System.in)) {

			System.out.print("정수 입력 범위(2~10): ");
			int num = scanner.nextInt();
			
			if(!(num>=2 && num<=10)) {
				System.out.println("범위외 입력입니다.프로그램 종료");
				System.out.println("끝");
				System.exit(0);
			}
			Ref ref = new Ref(num);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("\n끝");
	}

}
