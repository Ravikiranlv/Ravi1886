//How to Split String Message Into Tokens In Java With Example?

package practise;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Split_String_Message_Into_Tokens {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the URL Link : ");
		String msg = sc.nextLine();
		
		//String msg="http://10.205.145.789.5050";
		StringTokenizer stoken=new StringTokenizer(msg,  "://.");
		while(stoken.hasMoreTokens())
		{
			System.out.println(stoken.nextToken());
	}
 }
}
       //o/p=  Enter the URL Link : 
       //     https://3.141.59.R265P
       //     https
       //     3
        //    141
        //    59
         //   R265P           