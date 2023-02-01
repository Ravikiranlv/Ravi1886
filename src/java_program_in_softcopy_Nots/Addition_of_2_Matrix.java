// 46. Addition of 2 matrices.

/*
Enter the Element of Rows And Columns : 
2
3
Enter the First Element : 
22
24
23
25
23
25
Enter the 2 Element : 
2
3
4
5
6
7
Sum of the matrix is : 
24	
27	
27	
30	
29	
32	

 */

package java_program_in_softcopy_Nots;

import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class Addition_of_2_Matrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Element of Rows And Columns : ");
		int rows = sc.nextInt();
		int column = sc.nextInt();
		int a[][] = new int[rows][column];
		int b[][] = new int[rows][column];
		int sum[][] = new int[rows][column];
		System.out.println("Enter the First Element : ");
		for (int c = 0; c < rows; c++) {
			for (int d = 0; d < column; d++) {
				a[c][d] = sc.nextInt();
			}
		}
		System.out.println("Enter the 2 Element : ");
		for (int c = 0; c < rows; c++) {
			for (int d = 0; d < column; d++) {	
				b[c][d] = sc.nextInt();
			}
		}
		for (int c = 0; c < rows; c++) {
			for (int d = 0; d < column; d++) {
				sum[c][d] = a[c][d] + b[c][d];
			}
		}
		System.out.println("Sum of the matrix is : ");
		for (int c = 0; c < rows; c++) {
			for (int d = 0; d < column; d++) {
				System.out.println(sum[c][d] + "\t");
			}
		}
	}
}
