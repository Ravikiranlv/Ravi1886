package testyantra_Logics;

import java.util.Scanner;
class sample
{
	public static int add(int a, int b)
	{
		int result=a+b;
		return result;	
	}
}
public class practice {
	public static void main(String[] args) {
		sample a=new sample();
		System.out.println(a.add(10,20));
	}
}