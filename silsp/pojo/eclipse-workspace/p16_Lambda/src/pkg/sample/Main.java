package pkg.sample;

public class Main {
//익명 객체 화 한것!
	public static void main(String[] args) {
		
		SuperIntf impCls = new SuperIntf() {
			
			@Override
			public void mtdTest() {
				
				System.out.println("Ok!!!!!");
			}
		};				// 이 구조가 익명 객체 딱 한번만 사용할수 있음.
			
		impCls.mtdTest();
	}

}
