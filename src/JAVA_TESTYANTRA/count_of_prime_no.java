package JAVA_TESTYANTRA;

public class count_of_prime_no {
	public static void main(String[] args) {
		
	int count=0;
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
			count++;
		}
	  }
	 System.out.println("the count of prime number is "+" "+count);//o/p is the count of prime number is 26
	}
}
