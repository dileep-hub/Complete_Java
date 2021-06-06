package oops.inheritence;

public class Singer extends Person {
	
	public void sing()
	{
		System.out.println( name + " is singing");
	}
	
	// method overriding
	public void eat()
	{
		System.out.println("singer " + name + " is eating");
	}

	public static void laughing() 
	{
		System.out.println("singer is laughing");
	}

}
