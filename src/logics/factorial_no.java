//WAP to print the factorial in range from 1 to 100

package logics;
public class factorial_no {
	public static void main(String[] args) {
		for(int j=1;j<=100;j++)
		{
			int no=j;
			int fact=1;
			for(int i=no;i>=1;i--)
			{
				fact=fact*i;
			}
			System.out.println(fact);
		}
	}

}
