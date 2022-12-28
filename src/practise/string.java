package practise;

public class string {
	  public static void main(String[] args) {

			String ip="a3b4c5d6";
			String op="";
			for(int i=0;i<ip.length()-1;i=i+2)
			{
				String ch = ip.charAt(i+1)+"";
				int a=Integer.parseInt(ch);
				for(int j=a;j>=1;j--)
				{
					op=op+ip.charAt(i);
				}
			}
			System.out.println(op);
	  }
}
//  o/p =aaabbbbcccccdddddd

