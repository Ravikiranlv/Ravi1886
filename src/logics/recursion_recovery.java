
/*
 
  120
  
 */
package logics;
/***
  N=N *(N-1)*(N-2)----------    2-1
  5= 5 *4*3*2*1=120
 
 */

public class recursion_recovery {
	public static int factorial(int N)
	{
		if(N<=1)
		{
			return 1;
		}
		else return (N * factorial(N-1));
	}
	public static void main(String[] args) {
		System.out.println(factorial(5));
	}
}
