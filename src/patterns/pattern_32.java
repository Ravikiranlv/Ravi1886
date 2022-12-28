package patterns;

/*

Enter the Number : 
7
      *
     ***
    *****
   *******
  *********
 ***********
*************
 ***********
  *********
   *******
    *****
     ***
      *

 */
import java.util.Scanner;

public class pattern_32 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int a = sc.nextInt();

		for (int i = 1; i <= a; i++) {
			for (int j = a; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i) - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = a - 1; i >= 1; i--) {
			for (int j = a - 1; j >= i; j--) {
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
