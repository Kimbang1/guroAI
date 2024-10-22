package numList;

public class Average implements NumberSequence {


	@Override
	public void mtdNumRes(double[] numData) {
		double sum = 0;
		for(int i = 0; i<numData.length; i++) {
			sum+=numData[i];
		}
		double avg = sum / numData.length;
		System.out.printf("평균 : %.1f\n",avg);
		
	}
}
