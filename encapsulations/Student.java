package encapsulations;

public class Student {
	
	private int age;
	private String name;
	
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		if(age>20)
		{
			System.out.println("U are too old to be a student");
		}
		else
		{
			this.age = age;
		}
	}
}

//In encapsulation, the variables of a class will be hidden from 
//other classes, and can be accessed only through the methods of their 
//current class.
