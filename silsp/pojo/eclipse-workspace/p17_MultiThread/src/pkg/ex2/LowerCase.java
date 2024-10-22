package pkg.ex2;

public class LowerCase implements Runnable {

	@Override
	public void run() {
		try {
		for (char ch = 'a';  ch < 'z'; ch++) {
			System.out.print(ch);
			Thread.sleep(1);
		}	
		} catch (Exception e) {
			
		}
		
	}
	
}
