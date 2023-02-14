package java_program_in_softcopy_Nots;

/**
 * 
 * @author ravik
 *
 */
public class Eliminate_the_number_in_a_String {
	public static void main(String[] args) {
    String s="rdcv1232552000jn1hnb%";
    String result = s.replaceAll("[0-9]", "");
    System.out.println(result);
	}
}
