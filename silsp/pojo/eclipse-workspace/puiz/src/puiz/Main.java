package puiz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[]num = new int[9];		//배열을 준것
			
		
		for(int i=0; i<9; i++) {			
		num[i] = scanner.nextInt();
		}
		
		int max = 0;//num[0]; //- 일때 백준에서 오류? WHy??				//최댓값구한것
		int index  = 0;
		
		for(int j=0; j<num.length; j++) {
			if(num[j]>max) {
				max = num[j];
				index = j+1;
			}
				
		}
	System.out.println(max);		//최댓값출력
	System.out.println(index);			//몇번째 수인지 출력
	scanner.close();
	}
	
}