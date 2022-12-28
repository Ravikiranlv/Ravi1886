//WAP to print count of non prime numbers from 1 to 100

package logics;
public class count_of_non_primeno 
{
	public static void main(String[] args) 
	{
		int count1=0;
		int count2=0;
		for(int j=2;j<=100;j++)
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
				count1++;
			}
			else
			{
				count2++;
			}
		}
		System.out.println("The count of non prime numbers from 1 to 100 is"+" "+count2);
	}

}
