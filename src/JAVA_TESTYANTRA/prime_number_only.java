package JAVA_TESTYANTRA;

public class prime_number_only {
	public static void main(String[] args) {
		for(int j=1;j<=100;j++)
		{
			int no=j;
			boolean flag=false;
			for(int i=2;i<no;i++)
			{
				if(no%i==0)
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				System.out.println("the prime number is"+" "+j);
			}
		}
	}

}
