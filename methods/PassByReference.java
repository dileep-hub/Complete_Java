package methods;

class Dog
{
	int legs;
}

public class PassByReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// creating object
		Dog c = new Dog();
		c.legs = 4;
		Dog d = new Dog();
		d.legs = 3;
		
		swap(c,d);
		System.out.println(c.legs + " " + d.legs);
		
		// in primitive datatypes it is pass by value not in non primitive [class]

	}
	
	static void swap(Dog a, Dog b)
	{
		Dog temp = a;
		a = b;
		b = temp;
		System.out.println(a.legs + " " + b.legs);
	}
	
}