package oops.inheritence;

public class Teacher extends Person {
	
	public void teach()
	{
		System.out.println(name + " is teaching");
	}
	
	// method overriding
	public void eat()
	{
		System.out.println("teacher " + name + " is eating");
	}

	public static void laughing() 
	{
		System.out.println("teacher is laughing");
	}
	
	// super  keyword
	public void talk()
	{
		super.talk();  // takes the data from parent class
		System.out.println("teacher " + name + "is talking");
	}
}
