//44. To find the perfect square.

package practise;

import java.util.Scanner;
public class Perfect_Square {
	static boolean checkperfectSquare(double x)
	 {
		 double sq=Math.sqrt(x);
		return ((sq-Math.floor(sq))==0);	 
	 }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		double num = sc.nextDouble();
		if(checkperfectSquare(num))
		{
			System.out.println(num+" : is a perfect square number");
		}
		else {
			System.out.println(num+" : is not a perfect square number");
		}
	}
}

//o/p  =Enter the Number :
//      81
//      81.0 : is a perfect square number