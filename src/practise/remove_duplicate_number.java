package practise;

import java.util.Scanner;

public class remove_duplicate_number {
	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 2, 8, 9, 1, 0 };
		int b = arr.length;
		for (int i = 0; i <b-1; i++) {
			for (int j = 0; j <b-1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int j = 0; j <arr.length; j++) {
			System.out.print(arr[j]+" ");
		}
	}
}
