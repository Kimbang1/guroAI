package arithmetic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String txt = "연산 종류";
		txt += "(1.더하기 2.빼기 3.곱하기 4.나누기)";
		System.out.println(txt);
		
		System.out.println("수행 연산 선택:");
		int calcType = scanner.nextInt();
		
		System.out.println("숫자 2개 입력 :");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		scanner.close();
		
		Calculator calculator = null;
		if(calcType ==1) {
			calculator = new Addition();
		}else if(calcType ==2) {
			calculator = new Subtraction();
		}else if(calcType ==3) {
			calculator = new Multiplication();
		}else if(calcType == 4) {
			calculator = new Division();	
		}
		
		System.out.println("==================");
		System.out.printf("결과 %.1f\n",calculator.calc(a, b));
		System.out.println("\n End");
	}

	
	
}
