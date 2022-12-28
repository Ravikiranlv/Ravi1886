//WAP to swap 2 String with out using third variable "hello java" and "hello ravi"

package logics;
public class SWAP_2_string {
	public static void main(String[] args) {
		String a="hello";
		String b="ravi";
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(5);
		System.out.println(a);
		System.out.println(b);
	}

}
