package java_program_in_softcopy_Nots;

import java.util.Scanner;

public class FabonaciiSeries_for_1st_ten_number {
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the Number : ");
		int a=0, b=1;
		System.out.print(a+" "+b+" ");
		for(int i=1;i<=10;i++)
		{
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}

}
