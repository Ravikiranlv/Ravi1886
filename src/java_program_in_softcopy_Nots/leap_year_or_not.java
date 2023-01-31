// 29. To check whether that year is leap year or not.
package java_program_in_softcopy_Nots;

/*
  Enter the Year: 
  2020
  It is a leap year :  2020

 */
import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class leap_year_or_not {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year: ");
		int year = sc.nextInt();
		if (year % 4 == 0 && year != 100 || year % 400 == 0) {
			System.out.println("It is a leap year :  " + year);
		} else {
			System.out.println("It is not a leap year :  " + year);
		}
	}
}
