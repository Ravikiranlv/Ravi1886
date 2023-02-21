/*
 
 O/P:-
enter the string : 
Welcome to java world
Welcome
to
java
world
emocleW ot avaj dlrow 

 */

package java_program_in_softcopy_Nots;

import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class reverse_the_world {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string : ");
		String s1 = sc.nextLine();
		String[] arr = s1.split(" ");
		for (String d : arr) {
			System.out.println(d);
		}
		for (int i = 0; i < arr.length; i++) {
			char[] arr2 = arr[i].toCharArray();
			for (int j = arr2.length - 1; j >= 0; j--) {
				System.out.print(arr2[j]);
			}
			System.out.print(" ");
		}
	}

}
