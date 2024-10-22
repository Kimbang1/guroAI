package numprPint;

public class Ref {

	private int num;

	public Ref(int num) {
		this.num = num;
	}

	public void mtd() {
		/*
		 * if(num<3 || num>9) { System.out.println("입력오류!\n"+
		 * "프로그램을 재실행하신 후\n"+"다시 입력해 주세요"); }else {
		 */for (int i = 0; i < 10; i++) { // 가로줄
			for (int j = 0; j < 10; j++) { // 세로줄
				System.out.printf((i + j) % num + 1 + " ");
				// 연산 후 뒤에 문자열과 합쳐져서 나옴.
			}
			System.out.println();

		}
	}

}
