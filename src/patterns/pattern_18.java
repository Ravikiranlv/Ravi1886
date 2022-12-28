package patterns;
/*

Enter the number : 
5
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 

 */
import java.util.Scanner;

public class pattern_18 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=a;j++)
			{
				System.out.print(j +" ");
			}
			System.out.println();
		}
	}

}
