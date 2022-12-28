
package JAVA_TESTYANTRA;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {
	public static void main(String[] args) throws IOException {
		File file=new File("D://New folder.txt");
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		 String s1 = br.readLine();
		 while(s1!=null)
		 {
			 System.out.println(s1);
			 s1=br.readLine();
		 }
	}

}
