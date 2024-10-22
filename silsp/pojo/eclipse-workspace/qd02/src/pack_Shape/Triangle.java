 package pack_Shape;

public class Triangle {

	public static void main(String[] args) {

		int i, j;

		for (i = 0; i < 5; ++i) {
			System.out.print("* ");
		    /* for (j = 0; j < i; ++j) {

	         }
		     System.out.println("");*/
			for (j = 1; j < 5 - i; ++j) {
				System.out.print("* ");

			}
			System.out.println();
		}

		System.out.println("\n끝");
	}
}
