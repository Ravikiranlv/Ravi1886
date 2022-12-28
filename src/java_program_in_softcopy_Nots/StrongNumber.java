package java_program_in_softcopy_Nots;

/*
 Q:- 9. To check given number is strong or not.
 
o/p:-
 
Enter the number : 
9
It is a Strong Number : 9


 */
import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class StrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = sc.nextInt();
		int copy = a;
		int fact = 1;
		int sum = 0;
		while (a != 0) {
			int rem = a % 10;
			for (int i = rem; i >= 1; i--) {
				fact = fact * i;
			}
			sum = sum + rem;
			a = a / 10;
		}
		if (copy == sum) {
			System.out.println("It is a Strong Number : " + copy);
		} else {
			System.out.println("It is not a Strong Number : " + copy);
		}
	}
}
