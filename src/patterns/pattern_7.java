/**
 
  x  
  x  
xxxxx
  x  
  x
    
 */
package patterns;

import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class pattern_7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == (n / 2) + 1 || j == (n / 2) + 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
