package java_program_in_softcopy_Nots;

/* Q: 22. To check whether a String is palindrome or not.

O/P:- Enter the String : 
gadag
Given String is palindrome : gadag

 */
import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class String_is_palindrome_or_not {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s1 = sc.nextLine();
		String s2 = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			s2 = s2 + s1.charAt(i);
		}
		if (s1.equals(s2)) {
			System.out.println("Given String is palindrome : " + s2);
		} else {
			System.out.println("Given String is not a palindrome: " + s2);
		}
	}
}
