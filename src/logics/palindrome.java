//WAP to check the given string is palindrome or not "madam"

package logics;
public class palindrome 
{
  public static void main(String[] args) 
  { 
	  String s="madam";
	  String rev="";
	  for(int i=s.length()-1;i>=0;i--)
	  {
		  rev=rev+s.charAt(i);
	  }
	  if(s.equals(rev))
	  {
		  System.out.println("it is a palindrome");
	  }
	  else
	  {
		  System.out.println("it is not a palindrome");
	  }
	
}
}
