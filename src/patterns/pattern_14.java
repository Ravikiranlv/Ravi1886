//Pyramid star PAttern-1

package patterns;

/*

Enter the Number Of Rows Tom Print the Pattern; 
5
#Printing Pattern#
     *
    ***
   *****
  *******
 *********

 */
import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class pattern_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number Of Rows Tom Print the Pattern; ");
		int rows = sc.nextInt();
		System.out.println("#Printing Pattern#");
		for (int i = 1; i <= rows; i++) {
			for (int j = rows; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (i * 2) - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();

	}

}
