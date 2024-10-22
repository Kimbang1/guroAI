package numList;

public class SmallNumber implements NumberSequence {

	
	@Override
	public void mtdNumRes(double[] numData) {
		double SmallNum = numData[0];
		for(int i =0; i<numData.length; i++) {
			if(numData[i]<SmallNum) {
				SmallNum = numData[i];
			}
		}
	/*public void mtdNumRes(double[] a) {
		if(a==null || a,length == 0) {
			System.out.println("배열이 비어있습니다.");
			return;
		}
		double min = a[0]; 
		for(int i = 0; i>a.length; i++) {
			if(a[i]<min) {
				min = a[i];
			}
		}*/
		System.out.println("가장 작은 값 :" + (int)SmallNum);
	}

	
}
