package patterns;

/*

Enter the Number : 
5
1 2 3 4 5 
A B C D E 
6 7 8 9 10 
F G H I J 

 */
import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class pattern_22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int a = sc.nextInt();
		int k = 1;
		char c = 'A';
		for (int i = 1; i <= a - 1; i++) {
			for (int j = 1; j <= a; j++) {
				if (i % 2 == 0) {
					System.out.print(c++ + " ");
				} else {
					System.out.print(k++ + " ");
				}
			}
			System.out.println();
		}
	}
}
