package patterns;
/*

Enter the Number : 
5
@ _ _ _ _ 
_ @ _ _ _ 
_ _ @ _ _ 
_ _ _ @ _ 
_ _ _ _ @ 

 */
import java.util.Scanner;
/**
 * 
 * @author ravik
 *
 */
public class pattern_25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a; j++) {
				if (j == i) {
					System.out.print("@" + " ");
				} else {
					System.out.print("_" + " ");
				}
			}
			System.out.println();
		}
	}
}
