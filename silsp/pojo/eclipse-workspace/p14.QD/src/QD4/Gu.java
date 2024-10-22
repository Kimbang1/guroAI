package QD4;

public class Gu {

	public void mtd() {

		for (int i = 1; i <= 9; i++) {
			System.out.println();
			for (int j = 2; j <= 9; j++) {

				// System.out.print(j+ "*" + i + "=" + i*j+" ");
				System.out.printf("%d*%d=%2d ", j, i, i * j);
			}
		}

	}

}
