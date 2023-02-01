// 47. multiplication of 2 matrices.

/*
 O/P:-
 Enter the Elemnet of Rows and Columns : 
2
2
Enter the Elemt of 1st matrix : 
2
2
2
2
Enter the element of rows and column for the 2nd matrix : 
2
2
Enter the 2nd matrix : 
1
2
3
4
Multiplication of matrices is ; 
8	


12	


8	


12	



 */
package java_program_in_softcopy_Nots;

import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class Multiplication_of_2_matrices {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Elemnet of Rows and Columns : ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0;
		int a[][] = new int[m][n];
		System.out.println("Enter the Elemt of 1st matrix : ");
		for (int c = 0; c < m; c++) {
			for (int d = 0; d < n; d++) {
				a[c][d] = sc.nextInt();
			}
		}
		System.out.println("Enter the element of rows and column for the 2nd matrix : ");
		int p = sc.nextInt();
		int q = sc.nextInt();
		if (n != p) {
			System.out.println("Matrices entered order can't be multiplayed with each other : ");
		} else {
			int b[][] = new int[p][q];
			int multiply[][] = new int[m][q];
			System.out.println("Enter the 2nd matrix : ");
			for (int c = 0; c < m; c++) {
				for (int d = 0; d < q; d++) {
					b[c][d] = sc.nextInt();
				}
			}
			for (int c = 0; c < m; c++) {
				for (int d = 0; d < q; d++) {
					for (int e = 0; e < p; e++) {
						sum = sum + a[c][e] * b[e][d];
					}
					multiply[c][d] = sum;
					sum = 0;
				}
			}
			System.out.println("Multiplication of matrices is ; ");
			for (int c = 0; c < m; c++) {
				for (int d = 0; d < q; d++) {
					System.out.println(multiply[c][d] + "\t");
					System.out.println("\n");
				}
			}
		}
	}
}
