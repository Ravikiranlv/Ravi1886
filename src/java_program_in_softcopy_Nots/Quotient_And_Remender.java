package java_program_in_softcopy_Nots;

/*Q : 16. To compute the quotient and remainder.
 
O/P:- Enter the Number of A and B : 
500
200
Quotient is : 2
remender is : 100

 */
import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class Quotient_And_Remender {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of A and B : ");
		int A = sc.nextInt();
		int B = sc.nextInt();
		int Quotient = A / B;
		int remender = A % B;
		System.out.println("Quotient is : " + Quotient);
		System.out.println("remender is : " + remender);
	}

}
