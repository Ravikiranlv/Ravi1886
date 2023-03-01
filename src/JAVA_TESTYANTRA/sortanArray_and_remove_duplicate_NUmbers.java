package JAVA_TESTYANTRA;

import java.util.Arrays;
import java.util.Scanner;

public class sortanArray_and_remove_duplicate_NUmbers {
	public static void main(String[] args) {
		// int arr[]= {10,5,25,100,4,1,5,10,25};
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the range : ");
		int c = sc.nextInt();
		int a[] = new int[c];
		System.out.println("Enter the Numbers only : ");
		for (int i = 0; i < c; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int k = a[0];
		a[0] = k;
		for (int i = 1; i < c; i++) {
			if (a[i] != k) {
				a[i] = a[i];
			}
			k = a[i];
		}
		System.out.println("The ascending number is: ");
		for (int o : a) {
			if (o != 0) {
				System.out.print(o + " ");
			}
		}
	}
}
