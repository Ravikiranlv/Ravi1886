package practise;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class frequence {
	public static void main(String[] args) {
		String s1 = "KARNATAKA";
		char arr[] = s1.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (Character a1 : arr) {
			if (!map.containsKey(a1)) {
				map.put(a1, 1);
			} else {
				int count = map.get(a1);
				map.put(a1, count + 1);
			}
		}
		for (java.util.Map.Entry<Character, Integer> o1 : map.entrySet()) {
			System.out.println(o1.getKey() + " " + o1.getValue());
		}
	}
}
