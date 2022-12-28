package collection_assignment;

public class upcasting {
	int a;
	int b;
}
	class demo extends upcasting 
	{
		int c;
		
	}

	class mainSample
	{
		public static void main(String[] args) {
			upcasting u=new upcasting();
			demo d=new demo();
			upcasting u2=(upcasting) d;
		}
	}


