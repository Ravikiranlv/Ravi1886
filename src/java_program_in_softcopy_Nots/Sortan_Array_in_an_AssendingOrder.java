//36. To sort an array in ascending order (Bubble sort).

/*
o/p:-
Enter the Range : 
5
Enter the Number : 
25
22
8
60
44
The Sorted of an array is : 
8 22 25 44 60 

*/

package java_program_in_softcopy_Nots;

import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class Sortan_Array_in_an_AssendingOrder {
	public static void main(String[] args) {
		// int arr[]= {1,7,14,5,3,10,6};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range : ");
		int a = sc.nextInt();
		int arr[] = new int[a];
		System.out.println("Enter the Number : ");
		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		}
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n; j++) {
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("The Sorted of an array is : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
