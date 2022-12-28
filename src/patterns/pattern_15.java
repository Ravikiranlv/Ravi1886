// Pyramid star Pattern-2
package patterns;

/*

Enter the number of Rows to Print Pattern Format : 
5
$Printing Pattern$
*********
 *******
  *****
   ***
    *
     
 */
import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class pattern_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Rows to Print Pattern Format : ");
		int rows = sc.nextInt();
		System.out.println("$Printing Pattern$");
		for (int i = rows; i >= 1; i--) {
			for (int k = 1; k <= (i * 2) - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
			for (int j = rows; j >= i; j--) {
				System.out.print(" ");
			}
		}
		sc.close();
	}
}
