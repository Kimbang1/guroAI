package numList;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int nCnt =0;
		while(true) {
			System.out.println("입력할 숫자 개수(2~10) :");
			nCnt = scanner.nextInt();
			
			if(nCnt>=2 && nCnt<=10) break;
		}
		
		double[] numData = new double[nCnt];
		System.out.println("숫자 데이터"+nCnt+"개 입력");
		for(int i = 0; i<numData.length; i++) {
			System.out.print((i+1) + ".입력값 :");
			numData[i] = scanner.nextDouble();
		}
		//참조 클래스 생성
		NumberSequence seq = null;
		
		//가장 큰 값 처리
		seq = new BigNumber();
		seq.mtdNumRes(numData);
		
		//가장 작은 값 처리
		seq = new SmallNumber();
		seq.mtdNumRes(numData);
		
		//평균 값 처리
		seq = new Average();
		seq.mtdNumRes(numData);
				
		
		
		scanner.close();
		System.out.printf("%.0f %d %s \n" );
	
		/*System.out.print("입력할 숫자 개수(2~10) :\n");
		int nCnt = scanner.nextInt();	
		
		System.out.println("숫자 데이터" + nCnt +"개 입력");
		
		double[] arr =  new double[nCnt];
		for(int i = 0; i<nCnt; i++) {
			System.out.print((i+1) + ". 입력값 :");
			double num = scanner.nextDouble();
			arr[i]=num;
		}
		scanner.close();
		
		
		BigNumber big = new BigNumber();
		big.mtdNumRes(arr);*/
	}

}
