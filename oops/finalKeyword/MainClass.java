package oops.finalKeyword;

public class MainClass extends Student{
	
	   //2 final int roll_no; //here it is must to assign a value
	   
//6	public void getDescription() {
//		System.out.println("inside the student class");
//	}
	// this throws error bcoz it has been declared final in other class
	// it cannot be overriden
	
	
	public static void main(String[] args) {
		
		final String name = "tom";
		//1 name = "harry";  cannot be changed coz it is declared as final var
		
		final int ROLL_NO; // good practice to make it in CAPS
		ROLL_NO = 12;
		//3  but inside main class u can assign it later
		
		final Student obj1 = new Student();
		Student obj2 = new Student();
		
		//5 obj1 = obj2;  //throws error coz it is a final class
		// here reference of it cannot be changed
		
		obj1.name1 = "dog";
		// but we can change the internal of it
	
	
	}

}

// final variable cannot be changed, overridden also cannot be extended

// final var can only be initialized once
// we must initialize a final var or else it throws error
// good practice to name final var in all CAPS.
// a final var is called as blank var if not initialzed while declaration
// in case of reference var internal state of that object can be changed, bu the reference
