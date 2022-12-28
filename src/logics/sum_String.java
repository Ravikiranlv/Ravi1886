//WAP to sum of the number in given String "GC18ELF2022JUNE27"

package logics;
public class sum_String 
{
	public static void main(String[] args)
  {
	String s="GC18ELF2022JUNE27";
	String a="0";
	int sum=0;
	for(int i=0;i<s.length();i++)
	{
	char ch=s.charAt(i);
	if(Character.isDigit(ch))
	  {
		a=a+ch;
	  }
	else
	  {
		sum=sum+Integer.parseInt(a);
		a="0";
	  }
	}
	System.out.println(sum+Integer.parseInt(a));
  }
}
