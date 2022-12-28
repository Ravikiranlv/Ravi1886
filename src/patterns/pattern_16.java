package patterns;
/*

Enter the number of rows to print the pattern format : 
6
#pattern printing#
@ A B C D E 
1 @ A B C D 
1 2 @ A B C 
1 2 3 @ A B 
1 2 3 4 @ A 
1 2 3 4 5 @ 

 
 */
import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class pattern_16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows to print the pattern format : ");
		int rows = sc.nextInt();
		System.out.println("#pattern printing#");
		for (int i = 1; i <= rows; i++) {
			char ch = 'A';
			int k = 1;
			for (int j = 1; j <= rows; j++) {
				if (i == j) {
					System.out.print("@" + " ");
				} else if (j > i) {
					System.out.print(ch++ + " ");
				} else {
					System.out.print(k++ + " ");
				}
			}
			System.out.println();
		}
	}
}
