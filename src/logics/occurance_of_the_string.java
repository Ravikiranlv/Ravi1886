//WAP  to count the occurance of each element in given string "karnataka"

package logics;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class occurance_of_the_string {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s1 = sc.nextLine();
		String s2 = s1.toUpperCase();
		// String a="karnataka";
		char[] arr = s2.toCharArray();
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
