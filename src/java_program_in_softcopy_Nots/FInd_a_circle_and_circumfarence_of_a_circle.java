package java_program_in_softcopy_Nots;

/* Q:- 24. To find the area and circumference of the circle
 
O/P:- 
Enter the Number : 
2
Area of the circle is : 12.568
Circumfarence of the circle : 12.568

 */
import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class FInd_a_circle_and_circumfarence_of_a_circle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int r = sc.nextInt();
		final double pi = 3.142;
		double area = pi * r * r;
		double circumfarence = 2 * pi * r;
		System.out.println("Area of the circle is : " + area);
		System.out.println("Circumfarence of the circle : " + circumfarence);
	}

}
