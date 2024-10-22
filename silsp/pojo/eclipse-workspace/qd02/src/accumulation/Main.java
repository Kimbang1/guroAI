package accumulation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		try(Scanner scanner = new Scanner(System.in);){
			
			int num1 = 0, num2 = 0;
			
			while(true) {
				System.out.println("값 2개 입력(1~10) : ");
				num1 = scanner.nextInt();
				num2 = scanner.nextInt();
				
				if((num1<1 || num1>10)||(num2 < 1 || num2 > 10)) {
					System.out.println("입력범위 초과. 재입력 요청!\n");
				}else {
					break;
				}
			}
			System.out.println("누적방식 : ");
			String sumType = scanner.next();
			int numType = 0;	//짝수 가정
			if(sumType.equals("홀수"))numType =1;
			
			OddEvenSum oddEvenSum = new OddEvenSum(num1, num2, numType);
			oddEvenSum.mtdSum();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	System.out.println("\nEnd");

	}

}
