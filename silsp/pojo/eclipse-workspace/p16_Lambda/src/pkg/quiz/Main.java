package pkg.quiz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("X 값 입력 :");
			double num = sc.nextDouble();
			
			
			AbsValue abs = a -> {
				double res =Math.abs(2*(Math.pow(num, 3))+ 3*(Math.pow(num, 2)) +4);
				//if(res<0) res *= -1;
				return res;
				
			};

			System.out.printf("절대값은 %.2f 입니다.", abs.mtdAbs(num));
			System.out.println("\n\nEnd");
			sc.close();
			
		} catch (Exception e) {
			//System.out.println(e.getMessage());
		}
		
	}

}
