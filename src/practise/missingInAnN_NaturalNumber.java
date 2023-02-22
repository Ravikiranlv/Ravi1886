/*
O/P:-
Enter the Range in Number: 
5
Enter the random Numbers : 
25
5
8
4
10
6 7 9 11 12 13 14 15 16 17 18 19 20 21 22 23 24 

 */

package practise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class missingInAnN_NaturalNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range in Number: ");
		int a = sc.nextInt();
		int arr[] = new int[a];
		System.out.println("Enter the random Numbers : ");
		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		HashSet<Integer> set = new HashSet<>();
		for (int i = arr[0]; i < arr[arr.length - 1]; i++) {
			set.add(i);
		}
		for (int j = 0; j < arr.length; j++) {
			set.remove(arr[j]);
		}
		for (Integer o : set) {
			System.out.print(o + " ");
		}
	}
}
