package ARRAY_LOGICS;

public class Simple_java_array_prgm {
	public static void main(String[] args) {
		int a=10;
		for(int i=10;i>0;i--)
		{
			for(int j=1;j<=10;j++)
			{
				if((i+j)==11)
				{
					int k = i*j;
					System.out.println(i+ "*" +j+ "=" +k);
				}
			}
		}
	}

}
