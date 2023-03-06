package practise;

import java.util.Scanner;

public class remove_duplicate_number {
	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 2, 8, 9, 1, 0 };
		int b = arr.length;
		int a[]=new int[b];
		int previce=arr[0];
		a[0]=previce;
		for (int i = 0; i <b-1; i++) {
			for (int j = 0; j <b-1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i1=1;i1<b;i1++) {
			if(arr[i1]!=previce) {
				a[i1]=arr[i1];
			}
			previce=arr[i1];
		}
		for(int j:a) {
			if(j!=0)
			System.out.print(j+" ");
		}
	}
}
