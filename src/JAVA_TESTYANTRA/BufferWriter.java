package JAVA_TESTYANTRA;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter {
	public static void main(String[] args) throws IOException {
		File file=new File("D://New folder.txt");
		FileWriter fw=new FileWriter(file, true);		
	  BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Hello");
		bw.newLine();
		bw.write("hello");
		bw.newLine();
		bw.flush();
		}

}
