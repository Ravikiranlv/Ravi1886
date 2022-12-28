package JAVA_TESTYANTRA;

import java.io.File;

public class FileHandler {
	public static void main(String[] args) {
		File fs=new File("D://New folder");
		if(fs.exists())
		{
			System.out.println("File exists");
		}
		else
		{
			System.out.println("File is not exists");
		}
		if(fs.mkdir())
		{
			System.out.println("Make file directeristic");
		}
		else
		{
			System.out.println("make file is not directeristics");
		}
		if(fs.delete())
		{
			System.out.println("file is deleted");
		}
		else
		{
			System.out.println("file is not deleted");
		}
	}

}
