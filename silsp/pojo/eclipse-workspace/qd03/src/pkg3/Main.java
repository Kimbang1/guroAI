package pkg3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	 
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			String txt = "단위를 변환할 번호를 선택하시오.";
			txt += "1.cm ->in\t  2.in ->cn\n\n";
			System.out.println(txt);
			
			System.out.print("번호 입력");
			int num = scanner.nextInt();
			
			Conversion conversion = null;
			
			double ins = 0;
			System.out.println();
			if(num==1) {
				System.out.println("센티미터(cm)입력 :" );
				ins = scanner.nextDouble();
				conversion = new CentiToInch(ins);
			}
			
		} catch (Exception e) {
			//System.out.println(e.getMessage());
		}

	}

}
