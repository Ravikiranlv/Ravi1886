package testyantra_Logics;

import java.util.Scanner;
 
public class maximum_element_in_an_array {
	public static void main(String[] args) {
		int a[] = new int[5];
		int max;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array of an Elements: ");
		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
		}
		max = a[0];
		for (int i = 1; i < 5; i++) {
			if (a[i] >max) {
				max = a[i];
			}
		}
		System.out.println("Maximum Element is " + max);
	}
}
