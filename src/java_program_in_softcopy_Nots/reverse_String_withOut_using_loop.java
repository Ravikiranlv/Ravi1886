package java_program_in_softcopy_Nots;

public class reverse_String_withOut_using_loop {
   static String s1="Ravikiran lv";
   static String s2="";
	public static void main(String[] args) {
		int x=s1.length()-1;
		disp(x);
		System.out.println(s2);
	}
	static void disp(int n)
	{
		if(n>=0)
		{
			s2=s2+s1.charAt(n);
			n--;
			disp(n);
		}
	}
}
