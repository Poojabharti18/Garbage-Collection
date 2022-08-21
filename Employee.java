package GarbageCollection;

public class Employee {
	private int id;
	private String ename;
	private int age;
	private static int nextid=1;
	public Employee(){
		id=nextid++;
	}
	public Employee(String ename,int age)
	{
		this();
		this.ename=ename;
		this.age=age;
		
	}
	void show()
	{
		System.out.println(id+ename+age);
	}
	void show1()
	{
		System.out.println(id);
	}
	
}
