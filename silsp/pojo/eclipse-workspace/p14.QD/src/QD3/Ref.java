package QD3;

public class Ref {

	private int num;			//필드
									
	public Ref(int num) {
		this.num = num;
	}

	public void mtd() {
		String result = Integer.toBinaryString(num);

		System.out.printf("%d의 2진수: %08d \n",num, Integer.parseInt(result)); 
		// f는 실수를 표시하고 d는 정수 s는 문자열 인데
		// 인티저라는 클래스 안에 파스인트라는 메소드로
		// 괄호안에 있는 값을 정수 변환

	}

}
