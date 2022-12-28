package patterns;
/*

Enter the Number : 
5

1   2  3  4  5 
6   7  8  9 10 
11 12 13 14 15 
16 17 18 19 20 
21 22 23 24 25 

 */
import java.util.Scanner;

public class pattern_19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int a = sc.nextInt();
		int k = 1;
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a; j++) {
				System.out.print(k++ + " ");
			}
			System.out.println();
		}
	}

}
