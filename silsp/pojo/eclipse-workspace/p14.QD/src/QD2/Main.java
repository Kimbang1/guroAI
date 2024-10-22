 package QD2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("거리(Km)와 속력(Km/h) 입력:");
		int num = scanner.nextInt();
		int km = scanner.nextInt();
		
		Ref ref = new Ref(num,km);
		ref.mtd();
		
	
		System.out.println("\n\nEND");
		scanner.close();
		

	}

}
