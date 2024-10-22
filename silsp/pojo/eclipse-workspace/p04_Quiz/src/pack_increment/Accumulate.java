package pack_increment;

public class Accumulate {

	public static void main(String[] args) {
		
		int Ac = 0; //초기화
		for(int i = 1; i<=5; i++) //1부터 5까지 반복
			{
			Ac +=i; //누적합 계산
		

			System.out.printf("%d\t\t\t%d%n", i,  Ac);
			}
	}

}
