// 37. write a program to generate capca or OTP.

/*
O/P:-
Wajiia

 */
package java_program_in_softcopy_Nots;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class generate_capca_or_OTP {
	public static void main(String[] args) {
		String s1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String s2 = s1.toLowerCase();
		String s3 = "12456789";
		String s4 = s1 + s2 + s3;
		Random r = new Random();
		char[] arr = new char[6];
		for (int i = 0; i < 6; i++) {
			arr[i] = s4.charAt(r.nextInt(s4.length()));
		}
		for (int i = 0; i < 6; i++) {
			System.out.print(arr[i]);
		}
	}
}
