package patterns;
/*

Enter the Number : 
4

1 * 2 
3 * 4 
5 * 6 
7 * 8 

 */
import java.util.Scanner;
/**
 * 
 * @author ravik
 *
 */
public class pattern_20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int a = sc.nextInt();
		int k = 1;
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= 2; j++) {
				if (j == 2) {
					System.out.print("*" + " ");
				}
				System.out.print(k++ + " ");
			}
			System.out.println();
		}
	}
}
