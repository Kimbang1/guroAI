package pack_MVC;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		Map<String, String> objModel = new HashMap<>();
		String strRtn = root(objModel);  //DI 실행용 호출
		
		printData(strRtn,objModel);

	}
	
	private static void printData(String str,Map<String, String> model ) {
		String data = model.get("name1");
		System.out.println("name1 데이터 : " + data);
		
		data = model.get("name2");
		System.out.println("name1 데이터 : " + data);
		System.out.println("WEB-INF/views/"+str+".jsp");
	}

   private static String root(Map<String, String> model) {		//DI 적용
	   
	   //DI: Dependency Insertion(디펜던시 인서션)
	   //DI: Dependency Injection(디펜던시 인젝션)
	   //의존성 주입
	   
	   model.put("name1", "테스터1");
	   model.put("name2", "테스터2");
	   
	   return "result";		//반환값 = 뷰 이름
   }
}
