package oops.polymorphism;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// this is upstacting [ dog->pet->animal 
		Dog d = new Dog();
		Pet p = d;
		//Animal a = d;
		
	//  overriding
		System.out.println(d.name);
		System.out.println(p.name);
		
		d.walk();
		p.walk();
		// a.,walk();  throws error coz walk is not defined
		
		greeting();
		greeting("good morning");
		greeting(" Hello nyt..!", 4);

	}
	
	public static void greeting()
	{
		System.out.println("hi, there");
	}
	
	// overloading
	public static void greeting(String s)
	{
		System.out.println(s);
	}
	public static void greeting(String s, int n)
	{
		for (int i =0 ; i < n; i++){
		System.out.println("hi, there");
	}
}
}

//output
//Dog is walking
//Dog is walking


