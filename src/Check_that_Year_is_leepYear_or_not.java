import java.util.Scanner;
/* Q:- 29. To check whether that year is leap year or not.
 
O/P:- 

Enter the Year :  
2024
It is a leep Year : 2024

 */

/**
 * 
 * @author ravik
 *
 */
public class Check_that_Year_is_leepYear_or_not {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year :  ");
		int Year = sc.nextInt();
		if (Year % 4 == 0 && Year != 100 || Year % 400 == 0) {
			System.out.println("It is a leep Year : " + Year);
		} else {
			System.out.println("It is not a leep Year : " + Year);
		}
	}
}