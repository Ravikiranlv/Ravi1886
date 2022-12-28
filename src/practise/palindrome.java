package practise;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		String s1 = "MALAYALAM";
		String rev = "";
		for (int i = s1.length() - 1; i >=0; i--) {
			rev = rev + s1.charAt(i);
		}
		if (s1.equals(rev)) {
			System.out.println("it is palindrome");
		} else {
			System.out.println("It is not a palindrome");
		}

	}
}
