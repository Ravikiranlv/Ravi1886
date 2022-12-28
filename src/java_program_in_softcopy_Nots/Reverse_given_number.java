package java_program_in_softcopy_Nots;

/*
Q:-12. Reverse a given number.

Enter the Number : 
7841
Reverse of the Number is : 1487

 */
import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class Reverse_given_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int a = sc.nextInt();
		int rev = 0;
		while (a != 0) {
			int rem = a % 10;
			rev = rev * 10 + rem;
			a = a / 10;
		}
		System.out.println("Reverse of the Number is : " + rev);
	}

}
