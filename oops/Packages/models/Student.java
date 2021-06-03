package oops.Packages.models;

public class Student {

	private String name;
	
	//constructor of Student class
	public Student(String name)
	{
		this.name = name;
	}
	
	// public modified function   accessed by any packages 
	public String getName()  //function
	{
		getPassword();       // here it work coz by private can get accessed within the class
		return name;
	}
	
	// private modified function accessed only in this class
	private String getPassword()
	{
		return "12345";
	}
	
	// Default modified function only accessed in this package
	String myDefault()
	{
		return " accessed only in this package [Teacher class] ";
	}
	
}
