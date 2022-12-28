/*

r 
r a 
r a v 
r a v i 
r a v i k 
r a v i k i 
r a v i k i r 
r a v i k i r a 
r a v i k i r a n 
r a v i k i r a n l 
r a v i k i r a n l v

 */
package patterns;

import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class pattern_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :  ");
		String a = sc.nextLine();
		char[] b = a.toCharArray();
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j >= i; j--) {
				System.out.print(b[j] + " ");
			}
			System.out.println();
		}
	}

}
