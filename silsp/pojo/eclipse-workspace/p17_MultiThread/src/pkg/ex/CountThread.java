package pkg.ex;

public class CountThread extends Thread {

	@Override
	public void run() {

		System.out.println("멀티 스레드");

		try {
			for (int i = 0; i < 10; i++) {
				System.out.print(i);
				Thread.sleep(4);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
	}
}
