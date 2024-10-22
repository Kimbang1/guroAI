package Quiz.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {

			System.out.println("Scanner 클래스로 입력 받은 과일명 출력하기\n");

			System.out.println("과일 이름 입력");
			List<String> list = new ArrayList<>();{
			
			int num = 0;

			while (true) {
				num++;
				System.out.print("입력 " + num + ":");
				String str = sc.nextLine();

				if (str.equalsIgnoreCase("x"))break; 
				list.add(str);
			}
					
				

				System.out.println(str);

			}

			System.out.print("출력 결과\n");
			
			String[] 

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
