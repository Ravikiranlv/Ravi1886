package JAVA_TESTYANTRA;

public class PRIME_NOMBER {
	public static void main(String[] args) {
		
		for(int a=1;a<=100;a++)
		{
			int no=a;
			boolean flag = false;
			for(int i=2;i<no;i++)
			{
				if(no%2==0)
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				System.out.println(a+" "+"It is a prime nomber");
			}
			if(flag==true)
			{
				System.out.println("It is not a prime number"+" "+a);
			}
		}
	}
}
