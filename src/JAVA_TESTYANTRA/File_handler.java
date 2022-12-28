package JAVA_TESTYANTRA;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class File_handler {
	public static void main(String[] args) throws IOException {
		File fs=new File("D:\\New folder.txt");
		if(fs.createNewFile())
		{
			System.out.println("new file is created");
		}
		else
		{
			System.out.println("File is not created ");
		}
	}

}
