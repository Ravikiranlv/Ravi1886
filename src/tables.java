import java.util.Scanner;
/* Q 14. To print the tables .
 
O/P:- Enter the Number : 
2
2*1=2
2*2=4
2*3=6
2*4=8
2*5=10
2*6=12
2*7=14
2*8=16
2*9=18
2*10=20

 */

/**
 * 
 * @author ravik
 *
 */
public class tables {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "*" + i + "=" + (n * i));
		}
	}
}
