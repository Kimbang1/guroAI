package pack.cf.hashset;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("사과");
		set.add("포도");
		set.add("딸기");
		set.add("포도");
		set.add("사과");
		
		System.out.println("C.F의 개수 : "+ set.size());
		
		for(String str : set) {	//입력한 순서대로 안나오는 이유는 인덱스 번호가 없기때문!
			System.out.println(str);
		}
		
	}

}
