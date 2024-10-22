package bassic.gen.noapply;

public class Main {

	public static void main(String[] args) {

		Box<String> box1 = new Box<>();
		box1.setObj("딸기"); // 세터 매개변수 자료형 Object
		// ...

		String str = box1.getObj();
		System.out.println(str);

		Fruit fruit = new Fruit();
		//box1.setObj(fruit);
		// ....
		//Fruit fruit2 = (Fruit) box1.getObj();
		System.out.println();

	}

}
