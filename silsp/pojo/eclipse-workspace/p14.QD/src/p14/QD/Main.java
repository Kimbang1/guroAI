package p14.QD;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("수당 입력 :");
		int num = scanner.nextInt();

		Ref ref = new Ref(num);
		String formattedAmount = ref.mtd();

		System.out.println("실지급액 : " + formattedAmount);
		System.out.println("END");
		scanner.close();
	}

}
