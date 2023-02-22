// 43. To find Natural number.

/*
O/P:-
Enter the Number: 
3
Sum of Natural Number is : 6

 */

package java_program_in_softcopy_Nots;

import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class Natural_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("Sum of Natural Number is : " + sum);
	}
}
