package patterns;

import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class pattern_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			for (int k = a; k >= i; k--) {
				System.out.print(" " + " ");
			}
			System.out.println();
		}
	}

}
