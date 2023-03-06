package testyantra_Logics;

import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class Addition_of_two_matices {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows and column number : ");
		int rows = sc.nextInt();
		int column = sc.nextInt();
		int a[][] = new int[rows][column];
		int b[][] = new int[rows][column];
		int sum[][] = new int[rows][column];
		System.out.println("Enter the 1st rows numbers only: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the 2nd column number only : ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
		System.out.println("The sum of addition is : ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				System.out.println("the addition is " + sum[i][j] + "\t");
			}
		}
	}

}
