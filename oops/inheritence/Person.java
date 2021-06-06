package oops.inheritence;



//Person is our Parent class
public class Person {
	protected String name;
	
	public void walk()
	{
		System.out.println("person " + name + " is walking");
	}
	
	public void eat()
	{
		System.out.println("person " + name + " is eating");
	}
	
	public void talk()
	{
		System.out.println("person " + name + " is talking");
	}
	
	public static void laughing() 
	{
		System.out.println("person is laughing");
	}

}
