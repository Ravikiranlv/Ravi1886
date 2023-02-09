// write the java program to count the String by using hashMap

/*

Enter the String : 
Hi mam this the ravi iam the world national celebaratiobn day the
{THE=3, HI=1, NATIONAL=1, RAVI=1, IAM=1, CELEBARATIOBN=1, MAM=1, THIS=1, WORLD=1, DAY=1}

 */

package java_program_in_softcopy_Nots;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class count_number_of_String_by_using_hashMap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s1 = sc.nextLine();
		String s2 = s1.toUpperCase();
		String[] s3 = s2.split(" ");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < s3.length; i++) {
			if (map.containsKey(s3[i])) {
				Integer o = map.get(s3[i]);
				map.put(s3[i], o + 1);
			} else {
				map.put(s3[i], 1);
			}
		}

		System.out.println(map);
	}

}
