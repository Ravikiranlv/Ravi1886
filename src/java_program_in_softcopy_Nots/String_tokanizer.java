package java_program_in_softcopy_Nots;

import java.util.StringTokenizer;

/**
 * 
 * @author ravik
 *
 */
public class String_tokanizer {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("HI ravi How are You");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
