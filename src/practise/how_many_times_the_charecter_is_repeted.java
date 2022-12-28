//48. write a program for linear search algorithm or count how many times the  character is repeated in a given string.

package practise;

import java.util.Scanner;

public class how_many_times_the_charecter_is_repeted {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s1 = sc.nextLine();
		int count = 0;
		char[] s2 = s1.toCharArray();
		for (int i = 0; i < s2.length; i++) {
			if (s2[i] == 'a') {
				count++;
			}
			System.out.println(count);
		}
	}

}
//  o/p=  Enter the string: 
//        java
//        0
//        1
//        1
//        2