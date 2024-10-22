package pkg.ex;

public class Main {
	public static void main(String[] args) {
		//타겟 타입
		Test test = (num) -> {
		
		System.out.println("람다식 완성!!(매개변수 값 : "+num+")");
		
		return "가나다ABC";
		
		};
		String res = test.mtd(7);
		System.out.println("res :" + res);
	}

	public static void main(String[] args) {
	 
}
