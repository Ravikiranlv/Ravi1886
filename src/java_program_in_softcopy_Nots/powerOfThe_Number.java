package java_program_in_softcopy_Nots;

/*Q: 15. To find the power of a number.
 
O/P:- Enter the Number : 
8
Enter the Power : 
16
8^16=2.81474976710656E14
 
 */
import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class powerOfThe_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		System.out.println("Enter the Power : ");
		int m = sc.nextInt();
		// double result = Math.pow(n, m);
		System.out.println(n + "^" + m + "=" + Math.pow(n, m));
	}
}
