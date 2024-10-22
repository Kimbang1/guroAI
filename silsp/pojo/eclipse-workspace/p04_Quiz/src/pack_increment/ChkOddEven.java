package pack_increment;

import java.util.Scanner;

public class ChkOddEven {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
	
		String str= ( n%2 == 0) ? "짝수" : "홀수";
		System.out.println("str :" + str );
			
		}
	}


