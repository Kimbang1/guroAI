package pack.cf.hashmap;

import java.util.Iterator;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Map<Strnig, Integer> map = new HashMap<String, Integer>();

		map.put("딸기", 12000);
		map.put("사과", 7000);
		map.put("포도", 9000);
		map.put("딸기", 15000);

		System.out.println("map.size() :" + map.size());
		System.out.println(map.get("딸기"));

		System.out.println("-------------------------------");

		Set<String> set = map.KeySet();
		Iterator<String> keyIterator = set.iterator();

		while (keyIterator.hasNext()) {
			String strKey = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key + " : " + value);
		}

	}
}
