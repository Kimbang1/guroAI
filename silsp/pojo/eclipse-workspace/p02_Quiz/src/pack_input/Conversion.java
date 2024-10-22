package pack_input;

import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		
		int cm = cs.nextInt();
		
		System.out.println("센티미터 입력 :" + cm);
		
		double inch = Math.round (cm / 2.54);
		
		System.out.println( cm + " cm " + "=" +inch +"inch");
		
		System.out.println("Print OK!!");
	}

}
