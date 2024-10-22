package pack_input;

import java.util.Scanner;

public class price {

	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		System.out.println("총 결제액 계산");
		int num= sc.nextInt();
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		System.out.println("상품1 가격:" + num  );
		System.out.println("수량:" + num1  );
		
		System.out.println("상품2 가격:" + num2  );
		System.out.println("수량:" + num3  );
		
		System.out.println("================");
		System.out.println("총 결제액:" +((num * num1) + (num2* num3))   );
			System.out.println("Print OK!'");
	}
}
