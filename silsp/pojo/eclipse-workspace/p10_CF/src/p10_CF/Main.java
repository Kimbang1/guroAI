package p10_CF;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		
		List<String> vList = new Vector<>();
		vList.add("아메리카노");
		vList.add("카페라떼");
		vList.add("바닐라쉐이크");
		
		System.out.println("1.일반적인 for 순환제어문");
		for(int i = 0; i<vList.size(); i++) {
			System.out.println(vList.get(i));
		}
		
		System.out.println("2.향상된 for  순환제어문");
		for(String str: vList) {
			System.out.println(str);
		}
		
		
		for (int i = 0; i<vList.size(); i++) {
			Object obj = vList.get(i);
			System.out.println((i+1)+ "."+ obj);
			
		System.out.println("\n3.반복자(Iterator)를 사용한 순환");
		Iterator<String> iterator = vList.iterator();
		//이터레이터 = 반복자(배열이나 컬렉션의
		//크기와 순서를 알 수 없을 때 사용
		//단, 배열의 정의를 알고 있어도 사용가능)
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		System.out.println("\n4.일반 배열화");
		String[] strAry = vList.toArray(new String[vList.size()]);
		System.out.println();
			
		}
		
		

	}

}
