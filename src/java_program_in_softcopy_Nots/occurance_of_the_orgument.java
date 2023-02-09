package java_program_in_softcopy_Nots;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
/**
 * 
 * @author ravik
 *
 */
public class occurance_of_the_orgument {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s1 = sc.nextLine();
		String s2 = s1.toUpperCase();
		char arr[] = s2.toCharArray();
		Map<Character, Integer> set = new HashMap<Character, Integer>();
		for (char o : arr) {
			if (!set.containsKey(o)) {
				set.put(o, 1);
			} else {
				Integer b = set.get(o);
				set.put(o, b + 1);
			}
		}
		for (Entry<Character, Integer> o1 : set.entrySet()) {
			System.out.println(o1.getKey() + " " + o1.getValue() + " ");
		}
	}

}
