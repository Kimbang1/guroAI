package numList;

public class BigNumber implements NumberSequence {

	@Override
	//public void mtdNumRes(double[] a) {
	public void mtdNumRes(double[] numData) {
		double bigNum = numData[0];
		for(int i =0; i<numData.length; i++) {
			if(numData[i]>bigNum) {
				bigNum = numData[i];
			}
		}
		/*if( a == null || a.length==0) {
			System.out.println("배열이 비어있습니다.");
			return;
		}
		
		double max = a[0];
		for(int i= 0; i<a.length; i++) {
			if(a[i]> max) {
				max = a[i];
			}
		}*/
			System.out.println("가장 큰 값 :" + (int)bigNum);
		
	}
	
}
