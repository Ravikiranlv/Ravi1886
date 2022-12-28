//47. multiplication of 2 matrices.
package practise;

import java.util.Scanner;

public class Multiplication_of_matrix {
	public static void main(String[] args) {
		int m, n, p, q;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for rows and columns of 1st matrix:  ");
		m = sc.nextInt();
		n = sc.nextInt();
		int a[][] = new int[m][n];
		System.out.println("Enter the number of 1st matrix :");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the number of rows and columns of  2nd matrix: ");
		p = sc.nextInt();
		q = sc.nextInt();
		if (n!= p) {
			System.out.println("Matrices entered order can't be multiplied with each Other: ");
		} else {
			int b[][] = new int[p][q];
			int multiplay[][] = new int[m][q];
			System.out.println("Enter the number of 2nd matrix :");
			for (int k = 0; k < p; k++) {
				for (int l = 0; l < q; l++) {
					b[k][l] = sc.nextInt();
				}
				for (int r = 0; r < m; r++) {
					for (int s = 0; s < q; s++) {
						for (int t = 0; t < p; t++) {
							sum = sum + a[r][t] + b[t][s];
						}
						multiplay[r][s]=sum;
					}
				}		
				System.out.println("Multiplication of the matrices :");
				for(int r=0;r<m;r++)
				{
					for(int s=0;s<q;s++)
					{
						System.out.println(multiplay[r][s]+"\t");			
					}
					System.out.println("\n");
				}
			}
		}
	}
}


//  o/o = Enter the number for rows and columns of 1st matrix:  
//2
//2
//Enter the number of 1st matrix :
//2
//3
//4
//5
//Enter the number of rows and columns of  2nd matrix: 
//2
//2
//Enter the number of 2nd matrix :
//6
//7
//Multiplication of the matrices :
//11	
//23	


//38	
//54
