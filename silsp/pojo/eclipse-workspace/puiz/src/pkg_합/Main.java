package pkg_합;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();		// 배열의 크기 입력 받기

		int[] array = new int[N];		// 배열 선언

	
		for (int i = 0; i < N; i++) {	// 배열의 원소 입력 받기
			array[i] = sc.nextInt();
		}

		int sum = 0;
		for (int i = 0; i < N; i++) {	//입력된 수들의 합
			sum += array[i];
		}
		
		System.out.println(sum);

		sc.close();

	}

}
