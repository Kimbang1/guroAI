package pkg.quiz1;

import java.util.Scanner;

public class Main {

	//메인클래스에서는 입력
	public static void main(String[] args) {
			Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			System.out.print("숫자 입력(2~100) :");
			int num = scanner.nextInt();

			PrimeNumber pNumber = new PrimeNumber(num);	
			pNumber.mtdYaksu();			//불러오는 것!

		} catch (Exception e) {
			
		}finally {
		}scanner.close();
		
		System.out.println("\nPrint OK!");
	}

}
