package java_program_in_softcopy_Nots;

/* Q:- 23. To accept a character , determine whether the character is a lowercase or uppercase.
 
O/P:- It is a lowercase letter : c

 */
import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class check_Weather_Charecter_is_Upper_or_Lower_Case {
	public static void main(String[] args) {
		char ch = 'R';
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println("It is a uppercase letter : " + ch);
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println("It is a lowercase letter : " + ch);
		}
	}

}
