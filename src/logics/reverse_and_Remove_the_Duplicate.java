/*
 O/P:-
 Enter the String : 
ravi kiran hi hi
ravi
kiran
hi
hi
ivar narik ih ih 
ravi kiran hi 

 */

package logics;

import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class reverse_and_Remove_the_Duplicate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String a = sc.nextLine();
		String s1 = "";
		String[] arr = a.split(" ");
		for (String o : arr) {
			System.out.println(o);
		}
		for (int i = 0; i < arr.length; i++) {
			char[] arr1 = arr[i].toCharArray();
			for (int j = arr1.length - 1; j >= 0; j--) {
				System.out.print(arr1[j]);
			}
			System.out.print(" ");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			if (!(s1.contains(arr[i]))) {
				s1 = s1 + arr[i] + " ";
			}
		}
		System.out.println(s1);
	}
}
