package java_program_in_softcopy_Nots;

/**
 * 
 * @author ravik
 *
 */
public class number_in_decending {
	public static void main(String[] args) {
		for (int i1 = 10; i1 > 0; i1--) {
			for (int j = 1; j <= 10; j++) {
				if ((i1 + j) == 11) {
					int k = i1 * j;
					System.out.println(i1 + "*" + j + "=" + k);
				}
			}
		}
	}
}
