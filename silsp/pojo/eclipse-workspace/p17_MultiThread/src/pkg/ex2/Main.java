package pkg.ex2;

public class Main {

	public static void main(String[] args) {
		
		LowerCase obj = new LowerCase();
		Thread thread = new Thread(obj);
		
		thread.start();
		
		char[] ch = { 'ㄱ', 'ㄴ', 'ㄷ', 'ㄹ', 'ㅁ', 'ㅂ', 'ㅅ', 'ㅇ', 'ㅈ', 'ㅊ', 'ㅋ', 'ㅌ', 'ㅍ', 'ㅎ' };
		try {
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
			Thread.sleep(1);
			
		}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
