package pkg.quiz2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {

			System.out.print(" 숫자입력(1000~99999) : ");
			int num = scanner.nextInt();

			Ref ref = new Ref(num);
			ref.mtd();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("\nPrint Ok!");
	}

}
