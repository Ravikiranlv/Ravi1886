package patterns;

/*

Enter the Number : 
5
@ A B C D 
1 @ A B C 
1 2 @ A B 
1 2 3 @ A 
1 2 3 4 @ 

 */
import java.util.Scanner;

public class pattern_26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
			int k = 1;
			char ch = 'A';
			for (int j = 1; j <= a; j++) {
				if (j == i) {
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
