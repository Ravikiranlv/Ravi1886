package practise;

public class reverseStringSent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hi testyantra";
		String	strArr[] = str.split(" ");
		String rev="";
		for(int i=strArr.length-1;i>=0;i--){
			rev=rev+strArr[i];				
		}
		for(int i=0,j=0;i<str.length();i++){		
			if(str.charAt(i)==' '){
				System.out.print(" ");
			}
			else{
				System.out.print(rev.charAt(j));
				j++;
			}
		}

	}
}
