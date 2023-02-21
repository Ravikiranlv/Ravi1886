package logics;

public class Occurance_of_each_letter {

	public static void main(String[] args) {
		String s1 = "karnataka";
		for(char ch='a'; ch<='z' ; ch++) {
			int count =0;
			for(int i=0; i<s1.length(); i++) {
				char var = s1.charAt(i);
				if(ch==var) {
					count++;
				}
			}
			if(count>=0) {
				System.out.println(ch+" : "+count);
			}
		}
	}
}

