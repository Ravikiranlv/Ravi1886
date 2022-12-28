//right Star pattern program-2
package patterns;

/*

Enter the number of rows to print in pattern format : 
5
#pattern is printing#
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
public class pattern_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows to print in pattern format : ");
		int rows = sc.nextInt();
		System.out.println("#pattern is printing#");
		for (int i = 1; i <= rows; i++) {
			for (int j = rows; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();	
		}	
		sc.close();
	}

}
