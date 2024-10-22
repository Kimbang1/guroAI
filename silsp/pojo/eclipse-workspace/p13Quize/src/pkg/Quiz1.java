package pkg;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
																 //try -catch는 예상되는 오류를 처리해주는 것.
		
		try (Scanner scanner = new Scanner(System.in)) { 		//입력값을 받기위한 객체 생성
			int cnt =0;											//입력받을 문자의 개수에 대한 초기화
			
			while(true) {
			System.out.print("입력할 문자 개수(2~5) : ");
			cnt = scanner.nextInt();
																//16~23번 while 문은 무한루프 시킨이유로 20번줄의 조건에 맞지않으면 다시 17번 조건으로 돌아가기 위해서.
			if(cnt>=2 && cnt<=5)break;
			System.out.println("2~5사이의 값을 입력해주세요\n");
			
			}
			
			System.out.println();
			
			System.out.println("문자" + cnt + "개 입력");		
			String[] strAry = new String[cnt];				//배열값을 받기위한 객체 생성
					//생성된 객체의 주소값 
			for (int i = 0; i < strAry.length; i++) {		//배열의 순차적인 값을 받기위해
				System.out.print((i+1)+"입력값 :");
				strAry[i] = scanner.next();
			}
			
			System.out.println(); 			// 그냥 줄띄어준것
			
			System.out.print("오름차순 정렬:");
			Arrays.sort(strAry);
			System.out.println(Arrays.toString(strAry));
			
			System.out.print("내림차순 정렬:");
			Arrays.sort(strAry,Collections.reverseOrder());
			System.out.println(Arrays.toString(strAry));
			
							
		} catch (Exception e) {
						//객체 생성
			//System.out.println(e.getMessage()); //오류 설명해주는 곳
		} 
		
		
		
	}

}
