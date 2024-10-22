package QD2;

public class Ref {

	private double num,km;
		
	public Ref(int num,int km) {
			this.num = num;
			this.km = km;
	}
	
	public void mtd() {
		
	double a = num/km;
	int time = (int)a;
	int min = (int)((a- time) *60);	
	int sec = (int)((((a- time) *60)-min)*60);
	
	System.out.printf("예상 시간 : %02d시간 %02d분 %02d초",time,min,sec);
	
			// %02d 이유는 d는 정수고 0뒤에 2는 두자리 주어라 하는 자릿수 그리고
			// 0은 2자리가 안될때 0을 주어라고 하는 것.
			// %는 printf일때 변수나 값을 해당 자리에 바로 넣겠다고 선언한것!
		
		
	}
}
