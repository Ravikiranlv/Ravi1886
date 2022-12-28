//Star pattern Program-4
package patterns;

/*

Enter the Number of Rows to print in pattern Format : 
5
*****
 ****
  ***
   **
    *
 
 */
import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class pattern_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Rows to print in pattern Format : ");
		int rows = sc.nextInt();
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = rows; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
