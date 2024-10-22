package pack.bmi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	

		System.out.print("성별을 입력하세요(m/f) : ");
		String sex = scanner.nextLine();		//성별받기

		System.out.print("몸무게를 입력하세요(kg) : ");
		double Weight = scanner.nextDouble();	//몸무게
		
		System.out.print("키를 입력하세요(cm) : ");
		double High = scanner.nextDouble();		//키


		System.out.println("--------------------------");

		Bmi bmi = new Bmi(sex, Weight, High);
		bmi.mtd();
		
		
		System.out.println("\n끝");
		scanner.close();

	}

}
