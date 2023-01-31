// 35. Swap two numbers without using 3 rd. variables

/*
o/p:-
Enter the nubmber : 
20
10
The swap of A is : 10
The swap of B is : 20

*/
package java_program_in_softcopy_Nots;

import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class swap_two__number_withouUsing_third_variable {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nubmber : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("The swap of A is : " + a);
		System.out.println("The swap of B is : " + b);
	}
}
