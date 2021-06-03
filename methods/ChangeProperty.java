
package methods;

class Dog
{
	int legs;
}

public class ChangeProperty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// creating object
		Dog b = new Dog();
		b.legs=7;
		System.out.println(b.legs);
		
		changeDog(b);
		
		System.out.println(b.legs);
		
		// in primitive datatypes it is pass by value not in non primitive [class]

	}
	
	static void changeDog(Dog a)
	{
		a.legs = 8;
	}
	
}

//output
//7
//8