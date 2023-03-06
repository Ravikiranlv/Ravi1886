package testyantra_Logics;

import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class multiplication_of_an_2_matrices {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows and column : ");
		int rows = sc.nextInt();
		int column = sc.nextInt();
		int sum = 0;
		int a[][] = new int[rows][column];
		System.out.println("Enter the 1st matrices number : ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the element of 2nd rows and column matrices number : ");
		int c = sc.nextInt();
		int d = sc.nextInt();
		if (rows != c) {
			System.out.println("rows and column is properly enter the number properly ");
		} else {
			int b[][] = new int[c][d];
			int multyplay[][] = new int[rows][d];
			System.out.println("Enter the 2nd matrices : ");
			for (int i = 0; i < c; i++) {
				for (int j = 0; j < d; j++) {
					b[i][j] = sc.nextInt();
				}
			}
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < d; j++) {
					for (int k = 0; k < c; k++) {
						sum = sum + a[i][k] * b[k][j];
					}
					multyplay[i][j] = sum;
					sum = 0;
				}
			}
			for (int i = 0; i < c; i++) {
				for (int j = 0; j < d; j++) {
					System.out.println("Multiplication is :" + multyplay[i][j] + "/t");
					System.out.println("\n");
				}
			}
		}
	}

}
