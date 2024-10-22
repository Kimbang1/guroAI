package quiz;

import java.util.Random;
//시물레이션 조건 3가지
//1.실제와 유사할것
//2.
//3.
public class Main {

	public static void main(String[] args) {
		
		
		
		int total= 100;	
		int fCnt = 0;
		int bCnt = 0;
		
		Random random = new Random();
		
		for(int i =0; i<total; i++) {
			int tossResult = random.nextInt(2);
			if(tossResult == 0) {
				fCnt++;
			}else {
				bCnt++;
			}
		}
		System.out.println("앞면 : "+ fCnt);
		System.out.println("뒷면 : "+ bCnt);
	}

}
