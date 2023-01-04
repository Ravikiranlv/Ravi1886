package java_program_in_softcopy_Nots;

/*Q:- 28. To find the largest , smallest and second largest of three numbers.

O/P :- 
Enter the number a , b and c : 
120
5
200
First Largest Number is : 200
Second Larest Number is : 120
Smallest Number is : 5

 */
import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class largest_SecondLargest_Smallest_of_an_given_3_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number a , b and c : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int Largest = a;
		int Smallest = a;
		if (b > Largest) {
			Largest = b;
		}
		if (c > Largest) {
			Largest = c;
		}
		if (b < Smallest) {
			Smallest = b;
		}
		if (c < Smallest) {
			Smallest = c;
		}
		int SecondLargest = (a + b + c) - (Largest + Smallest);
		System.out.println("First Largest Number is : " + Largest);
		System.out.println("Second Larest Number is : " + SecondLargest);
		System.out.println("Smallest Number is : " + Smallest);
	}
}
