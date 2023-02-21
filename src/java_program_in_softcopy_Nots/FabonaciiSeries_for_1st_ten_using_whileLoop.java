package java_program_in_softcopy_Nots;

import java.util.Scanner;

public class FabonaciiSeries_for_1st_ten_using_whileLoop {
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the Number : ");
		int a=0,b=1;
		System.out.print(a+" "+b+" ");
		int i=1;
		while(i<=10)
		{
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			i++;
		}
	}
}
