// 48. write a program for linear search algorithm or count how many times the character is repeated in a given string.

/*
 O/P:-
 Enetr the String ; 
ravi
0
1
1
1

 */
package java_program_in_softcopy_Nots;

import java.util.Scanner;
                                     
/**
 *  
 * @author ravik
 *
 */
public class count_howMany_times_the_charecter_is_repeted {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the String ; ");
		String a = sc.nextLine();
		int count = 0;
		char arr[] = a.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'a') {
				count++;
			}
			System.out.println(count);
		}
	}
}
