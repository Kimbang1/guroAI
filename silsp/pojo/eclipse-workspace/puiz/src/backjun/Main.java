package backjun;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] arr = new int[30];
		for (int i = 0; i < 28; i++) {		//i<=28이라고 할땐 크거나 같다라고 한것이기에
											//사실상 0부터 28까지 돌기에 29번이 쳐짐
			int num = scanner.nextInt();
			arr[num - 1] = 1;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 1) {
				System.out.println(i + 1);
			}
		}

		scanner.close();

	}

}
