package pkg02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class RndCls {

	public void mtdRnd() {
		HashSet set = new HashSet();
		try {
			System.out.println("1부터 10사이의 랜덤값 3개");
		
			//Random random = new Random();
			//int[] rndNum = new int[3];
			int num = 0;
			for(;;) {
				num = (int)(Math.random()*10 +1);
				set.add(num);
				if(set.size() > 2) break; 
				
			}
			
			
			/*while(true) {
			for (int i = 0; i < 3; i++) {
				rndNum[i] = random.nextInt(10) + 1;
//				System.out.print(rndNum[i] + " " );
			}
//			System.out.println("\n");
			if( !((rndNum[0] == rndNum[1]) || 
				(rndNum[1] == rndNum[2]) || 
				(rndNum[0] == rndNum[2])) ) {
				break;
			  }
			}*/
//			System.out.println("----------------------------------");
			//System.out.print(rndNum[0] + " " + rndNum[1] + " "+ rndNum[2]);
//			System.out.println(set.toString());
			Iterator<Integer> iterator = set.iterator();
			while(iterator.hasNext()) 
			System.out.print(iterator.next()+" ");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
