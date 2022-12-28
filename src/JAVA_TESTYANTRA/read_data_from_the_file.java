package JAVA_TESTYANTRA;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class read_data_from_the_file {
	public static void main(String[] args) throws IOException {
		File file = new File("D://New folder.txt");
		FileReader fr = new FileReader(file);
		char[] arr = new char[(int) file.length()];
		fr.read(arr);
		String s1 = new String(arr);
		System.out.println(s1);
	}

}
