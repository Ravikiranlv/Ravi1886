package java_program_in_softcopy_Nots;
/* Q:- 27. To find the largest of two numbers.

O/P:-
Enter the Number : 
10
120
Largest Number is : 120

 */
import java.util.Scanner;
/**
 * 
 * @author ravik
 *
 */
public class Largest_of_Two_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int largest = a;
		if (b > largest) {
			largest = b;
		}
		System.out.println("Largest Number is : " + largest);
	}
}
