package java_program_in_softcopy_Nots;

/* 13. To check whether the given number is palindrome or not.

O/P :- Enter the number : 
474
It is a palindrome : 474

 */
import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class palondrome_or_not {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int rev = 0;
		int copy = n;
		while (n != 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		if (copy == rev) {
			System.out.println("It is a palindrome : " + copy);
		} else {
			System.out.println("it is not a palindrome : " + copy);
		}
	}
}
