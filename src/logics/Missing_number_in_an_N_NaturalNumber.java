package logics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Missing_number_in_an_N_NaturalNumber {
	public static void main(String[] args) {
		// int []n= {9,6,4,5,7,0,1};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range : ");
		int a = sc.nextInt();
		System.out.println("Enter the Number : ");
		int n[] = new int[a];
		for (int i = 0; i < a; i++) {
			n[i] = sc.nextInt();
		}
		Arrays.sort(n);
		HashSet<Integer> set = new HashSet<>();
		for (int i = n[0]; i < n[n.length - 1]; i++) {
			set.add(i);
		}
		for (int i = 0; i < n.length; i++) {
			set.remove(n[i]);
		}
		System.out.println("The missing Number is : ");
		for (int j : set) {
			System.out.print(j + " ");
		}
	}
}
