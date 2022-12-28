package JAVA_TESTYANTRA;

public class sum_prime_no_only {
	public static void main(String[] args) {
		int sum = 0;
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
			sum=sum+no;
		 }
	   }
		System.out.println("The sum of prime number is "+" "+sum);
	}

}
