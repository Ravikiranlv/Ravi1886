package practise;

import java.util.Scanner;

public class Addition_of_2_matrices {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Rows and  columns : ");
		int rows = sc.nextInt();
		int column = sc.nextInt();
		int a[][]=new int [rows][column];
		int b[][]=new int [rows][column];
		int sum [][]=new int[rows][column];
		System.out.println("Enter the Elements of 1st matrices :");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<column;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the Elements of 2dn matrices :");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<column;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<column;j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Sum of the matrices :");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.println(sum[i][j]+ "\t");
			}
		}
	}

}


// o/p=Enter the number of Rows and  columns : 
//      2
//      2
//     Enter the Elements of 1st matrices :
//      2
//      3
//      4
//      5
//     Enter the Elements of 2dn matrices :
//      6
//      7
//      8
//      9
//     Sum of the matrices :
//      8	
//      10	
//      12	
//      14