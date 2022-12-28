//WAP by using String Functions "HellO world" and "Hello aXer"

package logics;
public class String_functions
{
	public static void main(String[] args) 
	{
		String s="HellO world";
		String a="Hello aXer";
		System.out.println(s.length());
		System.out.println(a.length());
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.equals(a));
		System.out.println(s.charAt(7));
		System.out.println(s.indexOf("o"));
		System.out.println(s.toCharArray());
		System.out.println(s.substring(2));
		System.out.println(s.startsWith("He"));
		System.out.println(s.endsWith("lO"));
		System.out.println(s.equals(a));
		System.out.println(s.concat("hello"));
		System.out.println(s.contains("ellO"));
		System.out.println(a.equalsIgnoreCase(s));
	}

}
