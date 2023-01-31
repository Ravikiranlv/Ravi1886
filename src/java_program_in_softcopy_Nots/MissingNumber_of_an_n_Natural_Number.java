// 42. to find missing number in an N natural Number

/*
 O/P:-
Enter the Range : 
5
Enter the number : 
22
5
15
3
8
The missing number is : 
4 6 7 9 10 11 12 13 14 16 17 18 19 20 21

 */
package java_program_in_softcopy_Nots;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class MissingNumber_of_an_n_Natural_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the number : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		HashSet<Integer> set = new HashSet<>();
		for (int i = arr[0]; i < arr[arr.length - 1]; i++) {
			set.add(i);
		}
		for (int i = 0; i < arr.length; i++) {
			set.remove(arr[i]);
		}
		System.out.println("The missing number is : ");
		for (int a : set) {
			System.out.print(a + " ");
		}
	}
}
