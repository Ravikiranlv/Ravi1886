package patterns;
/*
 
N        N
NN       N
N N      N
N  N     N
N   N    N
N    N   N
N     N  N
N      N N
N       NN
N        N

 */
import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class pattern_6 {
	public static void main(String[] args) {
		int k=1;
		int n=10;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==n||j==1||j==k)
				{
					System.out.print("N");
				}
				else
				{
					System.out.print(" ");
				}
			}
			k++;
			System.out.println();
		}
	}

}
