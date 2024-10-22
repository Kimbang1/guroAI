package checked.excep.handling;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		String msg = "키보드의 키를 입력하고";
		msg+= "엔터를 입력하면";
		msg += "입력한 키의 코드번호가 반환됩니다.";
		
		int keyCode = 0;
		try {
			keyCode = System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("\n 입력한 키의 키코드 :" + keyCode);
				
	}

}
