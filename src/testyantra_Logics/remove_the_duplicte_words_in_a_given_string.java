/*
 O/P:-
 Enter the String : 
ravi hi hi
ravi hi 

 */

package testyantra_Logics;

import java.util.Scanner;

/**
 * s
 * 
 * @author ravik
 *
 */
public class remove_the_duplicte_words_in_a_given_string {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String a = sc.nextLine();
		String S1 = "";
		String[] arr = a.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (!(S1.contains(arr[i]))) {
				S1 = S1 + arr[i] + " ";
			}
		}
		System.out.print(S1);
	}
}
