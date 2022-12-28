package patterns;

/*

Enter the number : 
7
enter all the elements : 
18
54
35
107
44
98
19
it is even 18
Second1 smallest number  : 19
First smallest number  : 18

 */
import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class smallest_and_largestNumberof_an_array {
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
		int i = 0;
		if (a[i] % 2 == 0) {
			System.out.println("it is even " + a[i]);
		} else {
			System.out.println("it is odd " + a[n - 1]);
		}

		System.out.println("first largest number  : " + a[n - 1]);
		System.out.println("First smallest number  : " + a[0]);
	}

}
