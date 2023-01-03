package java_program_in_softcopy_Nots;

/* Q:- 20. To reverse a String using while loop.

O/P:-  Enetr teh String : 
ravikiran lv
vl narikivar

 */
import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class reverseString_using_whileloop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr teh String : ");
		String a = sc.nextLine();
		String b = "";
		int i = a.length() - 1;
		while (i >= 0) {
			b = b + a.charAt(i);
			i--;
		}
		System.out.println(b);
	}
}
