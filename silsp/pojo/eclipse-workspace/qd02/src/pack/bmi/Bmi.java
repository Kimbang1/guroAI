package pack.bmi;

public class Bmi {

	private String sex;
	private double weight, high;

	public Bmi(String sex, double weight, double high) {
		this.sex = sex;
		this.weight = weight;
		this.high = high;
	}

	public void mtd() {
		// 출력문이 있으면 void
		//출력문이 없을시 반환할 타입에 맞춰서 써주기

		double bmi = weight / (high/100*high/100);
		System.out.printf("당신의 BMI는 : %.1f입니다.\n",bmi);
		if (sex.equals("m")) { // 남자일경우

			if (bmi < 20.0) {
				System.out.println("저체중입니다.");
			} else if ( bmi < 23.0) {
				System.out.println("표준체중입니다.");
			} else {
				System.out.println("과체중입니다.");
			}
				
		} else { // 여자일경우
			
			if (bmi < 18.5) {
				System.out.println("저체중입니다.");
			} else if ( bmi < 23.0) {
				System.out.println("표준체중입니다.");
			} else {
				System.out.println("과체중입니다.");
			}
			
		}
		

	}

}
