package java_program_in_softcopy_Nots;

/* Q: 17. To find the simple interest.

O/P:- Enter the Principle : 
20
Enter the rate of Interset :
2
Enter the Time Period : 
5
The Simple Interest: 2.0

 */
import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class Simple_Interest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principle : ");
		float p = sc.nextFloat();
		System.out.println("Enter the rate of Interset :");
		float r = sc.nextFloat();
		System.out.println("Enter the Time Period : ");
		float t = sc.nextFloat();
		float result = (p * r * t) / 100;
		System.out.println("The Simple Interest: " + result);
	}
}
