//WAP to if the age is less than 18,then throw an exception with message as "con't vote" else print as "you can vote"

package logics;
public class cheked_exceptin {
	static void voter() throws voter_Exception
	{
		int age=17;
		if(age<=18)
		{
			System.out.println("con't vote");
		}
		else
		{
			throw new voter_Exception("you can vote");
		}
	}
	public static void main(String[] args) {
		try {
			voter();
		}
		catch(voter_Exception e)
		{
			System.out.println(e.getmsg());
		}
	}
}
 class voter_Exception extends Exception 
 {
	String msg;
	voter_Exception(String msg)
	{
		this.msg=msg;
	}
	public String getmsg()
	{
		return msg;
	}
 }

