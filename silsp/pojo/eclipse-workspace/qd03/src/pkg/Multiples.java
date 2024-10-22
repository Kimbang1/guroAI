package pkg;

import java.util.ArrayList;
import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력(범위 2~10) :");
		int num = sc.nextInt();

		if (num >= 2 && 10 >= num) {

			ArrayList<Integer> arrList = new ArrayList<>();
			
			int cnt = 1;
			while (num * cnt <= 50) {
				arrList.add(num * cnt);
				cnt++;
			}

			String printArr = arrList.toString();
			System.out.println(num + "의 배수 :" + printArr.substring(1, printArr.length() - 1));
		} else {
			System.out.println("범위 외 입력 입니다. 프로그램 종료. \n\nEnd.");
		}

		sc.close();
		System.out.println("\nEND");
	}

}

/*
 * if (num >= 2 && 10 >= num) { Multiples(num);
 * System.out.println("범위외 입력입니다. 프로그램 종료."); } else { break; }
 */