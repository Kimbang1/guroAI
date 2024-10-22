package accumulation;

public class OddEvenSum {
	
	private int num1;
	private int num2;
	private String sumType;
	
	public OddEvenSum(int num1, int num2, int numType) {
		this.num1=num1;
		this.num2=num2;
		this.sumType=numType;
	}

	public void mtdSum() {
		int small = num1;
		int big = num2;
		if (num1>num2) {
			small = num2;
			big = num1;
		}
		
		
		int big = Math.max(num1, num2);
		
	}
