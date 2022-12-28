package patterns;

import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class patterns_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a , b and c : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int largest = a;
		int smallest = a;
		if (b > largest)
			largest = b;
		if (c > largest)	
			largest = c;
		if (b < smallest)
			smallest = b;
		if (c < smallest)
			smallest = c;
		int seclargest = (a + b + c) - (largest + smallest);
		System.out.println("Largest number is : " + largest);
		System.out.println("Second largest number is : " + seclargest);
		System.out.println("Smallest number is : " + smallest);
	}
}	
/**
 * 
 * Enter the value of a , b and c : 10 80 20 Largest number is : 80 Second
 * largest number is : 20 Smallest number is : 10
 * 
 */
