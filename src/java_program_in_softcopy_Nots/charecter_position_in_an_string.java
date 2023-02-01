// 49. To find the character position in the String.

/*
O/P;- 
Enetr the String :  
ravikiran
charecter 0 Position r
charecter 1 Position a
charecter 2 Position v
charecter 3 Position i
charecter 4 Position k
charecter 5 Position i
charecter 6 Position r
charecter 7 Position a
charecter 8 Position n

 */
package java_program_in_softcopy_Nots;

import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class charecter_position_in_an_string {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the String :  ");
		String n = sc.nextLine();
		for (int i = 0; i < n.length(); i++) {
			char b = n.charAt(i);
			System.out.println("charecter " + i + " " + "Position " + b);
		}
	}
}
