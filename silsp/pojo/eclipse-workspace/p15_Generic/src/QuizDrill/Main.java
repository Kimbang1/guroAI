package QuizDrill;

public class Main {

	public static void main(String[] args) {
		
		int rndVal = (int)(Math.random( )*11+10);
		System.out.println(rndVal);
		
		
//		YaksuList objSuper = new YaksuList(rndVal);
//		objSuper.mtdYaksu();
		
		YaksuSum objsub = new YaksuSum(rndVal);
		objsub.mtdYaksu();
		
		System.out.println("\n\nEND");
	}

}
