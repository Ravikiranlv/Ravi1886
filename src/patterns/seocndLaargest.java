package patterns;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
/**
 * 
 * @author ravik
 *
 */
public class seocndLaargest {
	public static void main(String[] args) {
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("enter all the elements : ");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	
		System.out.println("Second1 smallest number  : " + a[1]);//a[n-1]
		System.out.println("First smallest number  : " + a[0]);
	}
}
/*

Enter the number : 
10
enter all the elements : 
5
6
7
0
8
7
5
9
10
88
Second1 smallest number  : 5
First smallest number  : 0

*/
