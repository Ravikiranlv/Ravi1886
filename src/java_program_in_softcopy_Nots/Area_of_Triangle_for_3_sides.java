// 33. To find the area of the triangle for 3 sides.

/*
 O/P:-
Enter the value of s1,s2 and s3 : 
2
2
2
Area of an Triangle : 3

 */
package java_program_in_softcopy_Nots;

import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class Area_of_Triangle_for_3_sides {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of s1,s2 and s3 : ");
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		int s = (s1 + s2 + s3) / 2;
		int area = (s * (s - s1) * (s - s2) * (s - s3));
		System.out.println("Area of an Triangle : " + area);
	}
}
