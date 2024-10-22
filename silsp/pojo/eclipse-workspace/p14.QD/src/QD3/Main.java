package QD3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		while (true) {

			System.out.print("10진수 입력(0~255):");
			num = scanner.nextInt();       

			if (0 <= num && num <= 255) {
				break;
			} else {
				System.out.println("0~255사이의 값을 입력해주세요");
			}
		}
		Ref ref = new Ref(num);
		// String result = Integer.toBinaryString(num);
		ref.mtd();

		scanner.close();
		
		System.out.println("\nEND");
		
	}

}
