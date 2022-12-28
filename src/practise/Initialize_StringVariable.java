//How to Initialize String Variable In Java With Example?


package practise;
/**
 * 
 * @author ravikiran 
 *
 */

public class Initialize_StringVariable {
	public static void main(String[] args) {
		String abc = "This is an Event show the attitude";
		String def=new String("This not an Event dint show Your attitude");
		char[] c= {'a','b','c','d'};
		String ghi=new String(c);
		String jkl = abc+"You are my enemy";
		
		System.out.println("================");
		System.out.println(abc);
		System.out.println(def);
		System.out.println(ghi);
		System.out.println(jkl);
	}

}
