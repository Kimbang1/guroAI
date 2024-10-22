package pack.reflec;

import java.lang.reflect.Field;

public class Main {

	public static void main(String[] args) {
		
		Class obj = Fruit.class;
		
		Field[] fields = obj.getDeclaredFields();
		
		for (Field a : fields) {
			System.out.println(a.getType().getName());
			System.out.println(a.getName());
			System.out.println("----------------------");
		}
		
		
	
	}
}
