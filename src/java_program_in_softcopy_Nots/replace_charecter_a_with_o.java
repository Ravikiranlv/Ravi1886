// 50. To replace char ‘A’ with ‘O’ in the given String.

/*
 O/p:-
Enter the String : 
ravi
rovi

 */
package java_program_in_softcopy_Nots;

import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class replace_charecter_a_with_o {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String n = sc.nextLine();
		String s1 = "";
		char arr[] = n.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'a') {
				s1 = s1 + 'o';
			} else {
				s1 = s1 + arr[i];
			}
		}
		System.out.println(s1);
	}

}
