package numprPint;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num =0;
		while (true) {
			System.out.print("숫자 입력(3~9) : ");
			num = scanner.nextInt();
			if(num > 3 && num < 9) {
				break;
			}
			String msg = "입력오류! \n";
			msg += "프로그램을 재실행 하신후\n";
			msg += "다시 입력해주세요.";
			System.out.print(msg);
			
		}
		
		Ref ref = new Ref(num);
		ref.mtd();

		scanner.close();

		System.out.println();
		//System.out.println("\n끝");

	}

}
