package patterns;

import java.util.Scanner;

public class pattern_23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int a = sc.nextInt();
		int k = 64;
		for (int i = 1; i <= a - 1; i++) {
			for (int j = 1; j <= a; j++) {
				if (i % 2 == 1) {
					System.out.print(j + " ");
				} else {
					System.out.print((char) (k + j) + " ");
				}
			}
			System.out.println();
		}
	}

}
