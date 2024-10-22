package QuizDrill;

import java.util.ArrayList;

public class YaksuList implements Yaksu {
	protected int rndNum;

	public YaksuList(int rndNum) {
		this.rndNum = rndNum;
	}

	@Override
	public void mtdYaksu() {
		
		ArrayList<Integer> yaksuList = new ArrayList<>();
		
		for (int i = 1; i <=rndNum; i++) {
			if (rndNum % i == 0){
				yaksuList.add(i);
				
			}
		}
		System.out.println("약수 :" + yaksuList);
	}
}
