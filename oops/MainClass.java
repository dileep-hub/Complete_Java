package oops;

//class should always declared outside the main;
//but object inside main.

class Cat
{
	boolean hasFur;
	String color, breed;
	int legs, eyes;
	
	// in python we use "def " here we use "public void"
	public void walk()
	{
		System.out.println("cat is walking");
	}
	public void eat()
	{
		System.out.println("cat is eating");
	}
	public void description()
	{
		System.out.println("Cat has " + legs + " legs and " + color +" colour");
	}
}


class Dog 
{
	String breed, name;
	public void jump()
	{
		System.out.println("my dog "+ name+ " is jumping");
	}
	public void description()
	{
		System.out.println("my dog is " + breed + " breed");
	}
}


public class MainClass {

	public static void main(String[] args) {
		
//		// here new alloctes a seperate memory for cat1[object]
//		
//		Cat cat1 = new Cat();
//		cat1.color = "black";
//		cat1.legs = 3;
//		
//		cat1.description();
		
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		
		dog1.breed = "husky";
		dog2.breed = "poodle";
		
		dog1.name = "zera";
		dog2.name = "letty";
		
		dog1.jump();
		
		dog1.description();
		dog2.description();
		
	}

}

//output for cat class
//Cat has 3 legs and black colour

//output for dog class
//my dog zera is jumping
//my dog is husky breed
//my dog is poodle breed
