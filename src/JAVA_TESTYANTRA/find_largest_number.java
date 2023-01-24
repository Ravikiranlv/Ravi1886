package JAVA_TESTYANTRA;

import java.util.Scanner;

public class find_largest_number {
	public static void main(String[] args) {
		/**
		 * int a[]= {44,10,450,1,10,15};
		 * 
		 * int largest=a[0]; for(int i=1;i<a.length;i++) { if(a[i]>largest) {
		 * largest=a[i]; } } System.out.println(largest); } }
		 **/

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of a , b and c :  ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int largest = a;
		int smallest = a;
		if (b>largest ) {
			largest = b;
		}
		if (c>largest ) {
			largest = c;
		}
		if (b<smallest) {
			smallest = b;
		}
		if (c<smallest) {
			smallest = c;
		}
		int Secondlargest = (a + b + c) - (smallest + largest);
		int small=a+b+c;
		System.out.println(largest);
		System.out.println(Secondlargest);
		System.out.println(smallest);
	}
}