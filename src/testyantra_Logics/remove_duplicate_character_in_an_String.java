package testyantra_Logics;

public class remove_duplicate_character_in_an_String {
	public static void main(String[] args) {

		String s = "aaaabbbcccdddfffwweerrs##@#$&()*%!@!&";
		char[] s1 = s.toCharArray();
		String s2 = "";
		for (int i = 0; i < s1.length; i++) {
          if(s2.indexOf(s1[i])==-1)
          {
        	  s2=s2+s1[i];
          }
		}
		System.out.println(s2);
	}
}
