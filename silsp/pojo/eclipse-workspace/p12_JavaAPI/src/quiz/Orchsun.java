package quiz;

import java.util.Scanner;

public class Orchsun {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			
		System.out.println("입력할 이메일 수 :");		//이메일 수
		int num =scanner.nextInt();
		scanner.nextLine();
		String[] arr = new String[num];
			// 배열의 값을 안전하게 빼준 것.421
		
		
		for(int i = 0; i <num; i++) {		
			System.out.println((i+1)+ "번 입력 :");
			String string = scanner.nextLine();
			arr[i] = string;
		}
		
		for(int i = 0; i<arr.length; i++) {
			
		}
		
		
		
	
		
		
		
	
		scanner.close();
		

	}

}
