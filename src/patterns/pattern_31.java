package patterns;
/*

Enter the Number : 
5
*********
 *******
  *****
   ***
    *
     
 */
import java.util.Scanner;

public class pattern_31 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int a=sc.nextInt();
		for(int i=a;i>=1;i--)
		{
			for(int k=1;k<=(2*i)-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		for(int j=a;j>=i;j--)
		{
			System.out.print(" ");
		}
	}
		sc.close();
	}
}
