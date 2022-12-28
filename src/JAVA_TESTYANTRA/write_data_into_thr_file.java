package JAVA_TESTYANTRA;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class write_data_into_thr_file {
	public static void main(String[] args) throws IOException {
		
		File file=new File("D:\\New folder.txt");
		FileWriter fw=new FileWriter(file);
		fw.write("Hello i will get the job");
		System.out.println("data is written"); 
		fw.flush();
	}

}
