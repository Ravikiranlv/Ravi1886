package JAVA_TESTYANTRA;

public class thread_program {
	public static void main(String[] args) {
		Thread t1 = new Thread();
		System.out.println(t1.getPriority());
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		t1.setName("ravikiranlv thread");
		t1.setPriority(1);
		System.out.println(t1.getName());
		System.out.println(t1.getId());
		System.out.println(t1.getName());
	}
}
