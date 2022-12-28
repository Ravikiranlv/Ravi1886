package logics;

/*
 Program to crate file in java 
 
 */
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * 
 * @author ravik
 *
 */
public class File_reader {
	public static void main(String[] args) {
		try {
			File file = new File("rmd.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			PrintWriter printwright = new PrintWriter(file);
			printwright.println("Print this Line");
			printwright.print(false);
			printwright.print(1999);
			printwright.close();
			System.out.println("Printed");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Catch block is printed");
		}
	}

}
