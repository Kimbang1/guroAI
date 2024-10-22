package p14.QD;

public class Ref {

	private int sum;

	public Ref(int sum) {
		this.sum = sum;

	}

	public String mtd() {
		double dRate = 0.033;
		double dAmount = sum * (1 - dRate);

		String formattedAmount = String.format("%,d", (int) Math.round(dAmount));

		return formattedAmount + "원";
	}

}
