package pkg.quiz2;

import java.util.Arrays;

public class Ref {

	private int num;

	public Ref(int num) {
		this.num = num;

	}

	public void mtd() {
		// System.out.println("num : " + num);

		String numStr = String.valueOf(num);

		String[] numAry = numStr.split(""); // 2741.split(""); => ["2", "7", "4", "1"]
		System.out.println("각 자리수 : " + Arrays.toString(numAry));
		int sum = 0;
		for (int i = 0; i < numAry.length; i++) {
			sum += Integer.parseInt(numAry[i]);
		}
		System.out.println("각 자리수의 합:" + sum);
	}

}
