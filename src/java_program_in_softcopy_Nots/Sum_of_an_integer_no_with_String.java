package java_program_in_softcopy_Nots;

import java.util.Scanner;

import practise.Charecter_position_of_an_String;

/**
 * 
 * @author ravik
 *
 */
public class Sum_of_an_integer_no_with_String {
	public static void main(String[] args) {
		// String s = "March012023and1997";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter between the String and NUmber in the line : ");
		String s = sc.nextLine();
		String a = "0";
		int n = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isDigit(ch)) {
				a = a + ch;
			} else {
				n = n + Integer.parseInt(a);
				a = "0";
			}
		}
		System.out.println(n + Integer.parseInt(a));
	}
}
