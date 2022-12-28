package patterns;
/**
 
ooo*ooo
ooo*ooo
ooo*ooo
*******
ooo*ooo
ooo*ooo
ooo*ooo

 */
import java.util.Scanner;
/**
 * 
 * @author ravik
 *
 */
public class pattern_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a; j++) {
				if (i == (a / 2) + 1 || j == (a / 2) + 1) {
					System.out.print("*");
				} else {
					System.out.print("o");
				}
			}
			System.out.println();
		}
	}
}
/*
Enter the Number : 
7
ooo*ooo
ooo*ooo
ooo*ooo
*******
ooo*ooo
ooo*ooo
ooo*ooo
*/