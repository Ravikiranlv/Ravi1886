//Star pattern program-3
package patterns;

/*

Enter the Number of Rows to Print pattern format : 
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
public class patteren_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Rows to Print pattern format : ");
		int rows = sc.nextInt();
		for (int i = 1; i <= rows; i++) {
			for (int j = rows; j >= i; j--) {
				System.out.print("*");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
