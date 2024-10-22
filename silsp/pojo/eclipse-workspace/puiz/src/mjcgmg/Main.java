package mjcgmg;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int T = scanner.nextInt();		//받아줄 텍스트의 갯수
		scanner.nextLine();
		
		String[] inputs = new String[T];
		
		for(int i =0; i<T; i++) {
			inputs[i] = scanner.nextLine();
		}
			
		for (int i = 0; i < T; i++) {		//텍스트의 범위가 맞을때 실행
			String input = inputs[i];

			if (input.length() > 0) {	

				char f = input.charAt(0);
				char l = input.charAt(input.length() - 1);

				System.out.println(f + "" + l);		//출력
			}

		}

		scanner.close();

	}

}
