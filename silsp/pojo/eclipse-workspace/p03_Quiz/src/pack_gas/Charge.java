package pack_gas;

import java.util.Scanner;

public class Charge {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int MJ= sc.nextInt();
		System.out.println("도시가스 요금 계산");
		System.out.println("---------------------\n");
		
		
		System.out.println("사용량 (MJ)입력: " + MJ);
		
	
		double dgs = 1150;
		double mog = 10161.7;
		double sgo = dgs+ (MJ * mog);
		
		double bgg = sgo/10;
		int sso = (int)(Math.round(sgo + bgg));
		 System.out.printf("부가 가치세 : %.1f 원\n",bgg);
		 System.out.printf("세후가스 요금 :" +sso +"원");
		 
		 System.out.println("\nPrint OK!");
		 
		 
		
		 

	}

}
