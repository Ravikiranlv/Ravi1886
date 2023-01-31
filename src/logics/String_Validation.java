package logics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
  O/P:-
  input:-1 
  input 1=Title
  o/p=true
  input 2=Titles
  o/p=false
  
  input:-2
  input 2=Titles
  o/p=true
  input2=Title
  o/p=false
  
 */
public class String_Validation {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("Ravikiranlv");
		Matcher match = pattern.matcher("Ravikiranlv");
		boolean a=match.matches();
		System.out.println(a);
		
		boolean c = Pattern.compile("Ravikiranlv").matcher("RavikiranLV").matches();
		System.out.println(c);
	}
}
