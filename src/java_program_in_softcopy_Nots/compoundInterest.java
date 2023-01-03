package java_program_in_softcopy_Nots;

/*Q: 18. To find the compound interest.

Enter the Principle : 
2
Enter the Time Period : 
2
Enter the Rate of Interest : 
2
Enter the Number : 
2
CompoundInterrest after 2years : 30.0
Amount after 2Years : 32.0

 */
import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class compoundInterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principle : ");
		int p = sc.nextInt();
		System.out.println("Enter the Time Period : ");
		int t = sc.nextInt();
		System.out.println("Enter the Rate of Interest : ");
		double r = sc.nextDouble();
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		double amount = p * Math.pow(1 + (r / n), n * t);
		double compoundInterest = amount - p;
		System.out.println("CompoundInterrest after " + t + "years : " + compoundInterest);
		System.out.println("Amount after " + t + "Years : " + amount);
	}

}
