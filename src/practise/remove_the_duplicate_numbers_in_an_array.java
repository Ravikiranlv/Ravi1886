package practise;

import java.util.Arrays;

public class remove_the_duplicate_numbers_in_an_array {
	public static void main(String[] args) {
		int[] a = { 4, 20, 5, 10, 4, 5, 20, 78, 1 };
		Arrays.sort(a);
		int n = a.length;
		int arr[] = new int[n];
		int previce = a[0];
		arr[0] = previce;
		for (int i = 1; i < n; i++) {
			if (a[i] != previce) {
				arr[i] = a[i];
			}
			previce = a[i];
		}
		for (int k : arr) {
			if (k != 0) {
				System.out.print(k + " ");
			}
		}
	}
}
