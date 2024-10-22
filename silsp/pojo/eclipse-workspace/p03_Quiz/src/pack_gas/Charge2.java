package pack_gas;

import java.util.Scanner;

public class Charge2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sg= sc.nextInt();
		int sr =sc.nextInt();
		
		int sgo =(sg * sr);
		int gs = (sgo/10);
		
		System.out.println("총 결제액 계산\n");
		System.out.println("상품가격 :" + sg);
		System.out.println("수량 :" + sr);
		System.out.println("===========");
		
		System.out.println("세전 결제액 : "+ sgo);
		System.out.println("적용세금(10%) : " + sgo/10);
		System.out.println("세후 결재액: " + (sgo + gs));
		

	}

}
