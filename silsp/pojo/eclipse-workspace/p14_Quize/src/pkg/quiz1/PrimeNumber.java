package pkg.quiz1;
  

public class PrimeNumber {
	private int num;
	public PrimeNumber(/*매개변수 들어가는곳*/) {
		
	}
	public PrimeNumber(int num) {
		this.num = num;

	}

	public void mtdYaksu() {
		System.out.print("[");
		int cnt = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i);
				if (i < num)
					System.out.print(", ");
				cnt++;
				// 참조 클래스에서는 입력받은 값을
				// 전달받은 후 관련 작업 진행

			}
		}
		System.out.print("]\n");
		System.out.println("약수의 개수 : " + cnt);
		if (cnt <= 2) {
			System.out.println("소수입니다.");
		}
	}
}
