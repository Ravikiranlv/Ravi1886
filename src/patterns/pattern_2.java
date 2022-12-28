/*
 
   *
  ***
 *****
*******
 *****
  ***
   *
   
 */
package patterns;

import java.util.Scanner;
/**
 * 
 * @author ravik
 *
 */
public class pattern_2 {
	public static void main(String[] args) {
		int space=3;
		int star=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			space--;
			star=star+2;
			System.out.println();
		}
		int space1=1;
		int star1=5;
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=space1;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star1;j++)
			{
				System.out.print("*");
			}
			space1++;
			star1=star1-2;
			System.out.println();
		}
	}
}

//         *
//        ***
//       *****
//      *******
//       *****
//        ***
//         *

