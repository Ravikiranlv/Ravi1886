package practise;

import java.util.Scanner;

public class fabbicio_seris {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		int k = sc.nextInt();
		int f1 = 0;
		int f2 = 1;
		int f3;
		//System.out.println(f1+" "+f2+" ");
		for(int i=1;i<=10;i++)
		{
			f3=f1+f2;
			System.out.print(f3+" ");
			f1=f2;
			f2=f3;
		}
	}

}
