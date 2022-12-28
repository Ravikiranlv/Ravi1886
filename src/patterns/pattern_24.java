package patterns;

import java.util.Scanner;

public class pattern_24 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=1;j++)
			{
				System.out.print("_"+"_"+"*"+"_");
			}
			System.out.println();
		}
	}

}
