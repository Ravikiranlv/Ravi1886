package JAVA_TESTYANTRA;

/*

Enter the String and Numbers : 
Testyantra
Testyanr

 */
import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class Remove_Duplicate_charecter_in_the_String {
	public static String DuplicateString(String a) {
		char b[] = a.toCharArray();
		String s1 = "";
		for (int i = 0; i < b.length; i++) {
			if (s1.indexOf(b[i]) == -1) {
				s1 = s1 + b[i];
			}
		}
		return s1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String and Numbers : ");
		String a = sc.nextLine();
		System.out.println(DuplicateString(a));
	}
}
