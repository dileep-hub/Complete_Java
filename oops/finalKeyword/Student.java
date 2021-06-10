package oops.finalKeyword;

public class Student {
	
	final int roll_no;
	
	{
	roll_no = 34;
	}
	//4 to assign final var without initializing 
	// then we hav to assign value to it inside the block
	
	String name1 = "abc";
	
	final public void getDescription() {
		System.out.println("inside the student class");
	}
	
	
}
