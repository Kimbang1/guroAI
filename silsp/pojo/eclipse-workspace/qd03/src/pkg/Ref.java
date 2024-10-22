package pkg;

import java.util.Iterator;

public class Ref {
	
	private int num;
	
	public Ref(int num) {
		this.num = num;
	}
	public void mtd() {
		System.out.println(num+"의 배수:");
		for(int i =num; i<=50; i++) {
			if(i%num ==0) {
				System.out.println(i);
				if(i<(50-num))
				System.out.println(", ");
			}
		}
	}
	
	
}
