// Star pattern program-1
package patterns;

/**

Enter the number of rows in pattern format : 
5
#Printing the star pattern#
*
**
***
****
*****

 */
import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class pattern_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows in pattern format : ");
		int rows = sc.nextInt();
		System.out.println("#Printing the star pattern#");
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
