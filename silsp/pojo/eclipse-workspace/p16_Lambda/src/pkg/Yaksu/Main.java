package pkg.Yaksu;
  
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		int rndVal = (int) (Math.random() * 11 + 10);
		System.out.println("생성된 랜덤 값 :" + rndVal + "\n");

		List<Integer> list = new ArrayList<Integer>();
		Yaksu yaksulist = a -> {

			for (int i = 1; i <= a; i++) {
				if (a % i == 0)
					list.add(i);
			}
			System.out.println("약수 :"+ list.toString());
		};
		Yaksu yaksuSum = b -> {
			int sum = 0;
			for (int i = 0; i < list.size(); i++) {
				sum += list.get(i);
				
			}
			System.out.println("약수의 합 : "+ sum);
		};

		yaksulist.mtdYaksu(rndVal);
		yaksuSum.mtdYaksu(rndVal);

		System.out.println("\nEnd");
	}

}
