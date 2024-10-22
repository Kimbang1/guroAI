package pkg.ex;

public class Main {

	public static void main(String[] args) {

		CountThread countThread = new CountThread();
		// countThread.run(); //단일 스레드
		countThread.start(); // 멀티 스레드
		System.out.println("메인 스레드");

		try {
			for (char ch = 'A'; ch <= 'Z'; ch++) {
				System.out.print(ch);
				Thread.sleep(2);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
