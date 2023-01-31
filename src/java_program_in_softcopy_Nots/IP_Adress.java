package java_program_in_softcopy_Nots;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 
 * @author ravik
 *
 */
public class IP_Adress {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress inet=InetAddress.getLocalHost();
		System.out.println("My IP adress is : ");
		System.out.println(inet.getHostAddress());
		System.out.println(inet.getHostName());
		System.out.println(inet.getAddress());
	}
}
