package testyantra_Logics;

import java.util.Arrays;

public class SortedAnArray_and_remove_the_duplicate_number {
	public static void main(String[] args) {

		int arr[] = { 10, 55, 4, 5, 7, 8, 21, 20, 5, 7, 0, 10 };
		Arrays.sort(arr);
		int n = arr.length;
		int a[]=new int [n];
		int k = arr[0];
		a[0]=k;
		for (int i = 1; i <n; i++) {
			if(arr[i]!=k) {
				a[i]=arr[i];
			}
			k=arr[i];
		}
		for(int b:a) {
			if(b!=0) {
				System.out.print(b+" ");
			}
		}
	}
}
