//How to Split String Message By Using Space Tokenizer In Java?

package practise;
/*
  //Enter the String :
  // hi ravi how are You
  //count :5
 */
import java.util.Scanner;
import java.util.StringTokenizer;
/**
 * 
 * @author ravik
 *
 */
public class Split_String_Message_By_Using_Space_Tokenizer {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String msg = sc.nextLine();
		StringTokenizer tokens=new StringTokenizer(msg," ");
		System.out.println("count :"+tokens.countTokens());
		//Enter the String :
		// hi ravi how are You
		 //count :5
	}

}
