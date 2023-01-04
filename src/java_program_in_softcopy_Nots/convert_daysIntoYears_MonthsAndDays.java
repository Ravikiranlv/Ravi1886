package java_program_in_softcopy_Nots;

/* Q:- 25. To convert days into years , months and days.
 
O/P:- 
Enter the Number : 
366
Years 1
Months 0
Days 1


 */
import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class convert_daysIntoYears_MonthsAndDays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int totalDays = sc.nextInt();
		int years = totalDays / 365;
		totalDays = totalDays % 365;
		int Months = totalDays / 30;
		int days = totalDays % 30;
		System.out.println("Years " + years);
		System.out.println("Months " + Months);
		System.out.println("Days " + days);
	}

}
