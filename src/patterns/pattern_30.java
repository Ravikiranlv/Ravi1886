package patterns;

/*

Enter the Nuber : 
5
     *
    ***
   *****
  *******
 *********

 */
import java.util.Scanner;

public class pattern_30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Nuber : ");
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
			for (int j = a; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i) - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
