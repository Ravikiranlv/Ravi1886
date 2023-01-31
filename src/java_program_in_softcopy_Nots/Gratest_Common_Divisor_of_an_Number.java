// 41. To find the GCD of a number.

/*
 O/P:-
 Enter the Number ; 
110
5
The Greatest Common Division number is : 5

 
 */
package java_program_in_softcopy_Nots;

import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class Gratest_Common_Divisor_of_an_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ; ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		System.out.println("The Greatest Common Division number is : " + b);
	}

}
