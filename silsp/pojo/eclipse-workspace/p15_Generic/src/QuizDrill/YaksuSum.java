package QuizDrill;

public class YaksuSum extends YaksuList{
	

public YaksuSum(int rndNum) {
		super(rndNum);
		// TODO Auto-generated constructor stub
	}

@Override
	public void mtdYaksu() {
		 
		int sum =0;
		for (int i = 1;  i <=rndNum; i++) {
			if (rndNum% i == 0){
				sum += i;
			}
	}
		super.mtdYaksu();
		System.out.print("약수의 합 : " + sum);
}
}