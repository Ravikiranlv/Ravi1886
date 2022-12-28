package ARRAY_LOGICS;

public class p6 {
	public static void main(String[] args) {
		char ch[]= {'R','A','V','I','K','I','R','A','N',' ','L','V'};
		String str = String.copyValueOf(ch);
		System.out.println("Original value is: "+str);
		String substr = String.copyValueOf(ch, 5, 7);
		System.out.println("Substring from the original String is: "+substr);
	}

}
