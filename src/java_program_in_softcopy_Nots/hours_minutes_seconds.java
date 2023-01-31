// 32. To convert seconds into hours , minutes and seconds.

/*
o/p:-
Enter the TotalSeconds : 
3600
Hours : 1
minutes : 60
second : 0


*/
package java_program_in_softcopy_Nots;

import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class hours_minutes_seconds {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the TotalSeconds : ");
		int totalseconds = sc.nextInt();
		int sec = totalseconds;
		int hours = sec / 3600;
		int seconds = sec % 3600;
		int minutes = sec / 60;
		seconds = sec % 60;
		System.out.println("Hours : " + hours);
		System.out.println("minutes : " + minutes);
		System.out.println("second : " + seconds);
	}
}
