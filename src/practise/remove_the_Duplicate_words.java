package practise;

import java.util.Scanner;

public class remove_the_Duplicate_words {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s1=sc.nextLine();
		String s4=s1.toLowerCase();
		String [] s2=s4.split(" ");
		String s3="";
		for(int i=0;i<s2.length;i++)
		{
			if(!(s3.contains(s2[i])))
			{
				s3=s3+s2[i]+" ";
			}
		}
		System.out.println(s3);
	}
}
