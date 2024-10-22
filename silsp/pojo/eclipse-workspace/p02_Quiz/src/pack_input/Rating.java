package pack_input;

import java.util.Scanner;

public class Rating {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			double ssg = sc.nextInt();
			double cch = sc.nextInt();
			
			System.out.println("TV 수신가구 :" + Math.round(ssg));
			System.out.println("청취가구 : " + Math.round(cch));
			
			double view = (cch/ssg) *100;
			System.out.printf("시청률 : %.1f%%\n" , view );
			
			System.out.println("Print OK!!");

	}

}
