//WAP to print nonprime numbers only in a given range 1 to 100

package logics;
public class nonprime_no_only
{
  public static void main(String[] args)
  {
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
		if(flag==true)
		{
			System.out.println(j+" "+"it is non prime numbder");
		}
	}
  }
}
