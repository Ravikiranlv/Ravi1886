//WAP to create Emp_name,Emp_id,Emp_sal by using getters and setters and obtain as updated values
package logics;
class emp
{
		private static String name="ravikiran";
		private static int id=4567;
		private static double sal=63457.589;
		
		public  static String getname()
		{
			return name;
		}
		public static int getId()
		{
			return id;
		}
		public static double getsal()
		{
			return sal;
		}
		public void setvalues(String name,int id,double sal)
		{
			this.name=name;
			this.id=id;
			this.sal=sal;
		}
}
public class encapsulation 
{
	public static void main(String[] args)
	{
		emp s=new emp();
		System.out.println(s.getname()+" "+s.getId()+" "+s.getsal());
		s.setvalues("ravikiranlv16",7654,63457.985);
		System.out.println(s.getname()+" "+s.getId()+" "+s.getsal());
	}
}

