// 40. To print the number in pyramid shape.

/*
O/P:-

Enter the Number : 
5
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

 */
package java_program_in_softcopy_Nots;

import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class print_number_of_an_pyramid {
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
