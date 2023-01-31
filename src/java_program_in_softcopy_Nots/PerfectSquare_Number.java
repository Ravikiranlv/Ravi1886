// 44. To find the perfect square.

/*
O/P:-
Enter the NUmber : 
4
4.0 : It is a perfect square Number

 */

package java_program_in_softcopy_Nots;

import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class PerfectSquare_Number {
	public static boolean ischeckperfectsquare(double a) {
		double sq = Math.sqrt(a);
		return ((sq - Math.floor(sq)) == 0);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the NUmber : ");
		double n = sc.nextDouble();
		if (ischeckperfectsquare(n)) {
			System.out.println(n + " : It is a perfect square Number");
		} else {
			System.out.println(n + " : It is not a perfect square Number");
		}
	}

}
