package oops;


//constructor shud have same name as class
// it will called automatically when an object is called
// no return type


//public class MyConstructor {
//
//	MyConstructor()
//	{
//		System.out.println("Object created");
//	}
//	
//	public static void main(String[] args) {
//		
//		MyConstructor obj = new MyConstructor();
//		
//	}
//
//}

//output
//Object created


//Non paratmetriced constructor

//class Vehicle
//{
//int wheels;
//
//Vehicle()
//{
//	wheels = 4;
//}
//}
//
//public class MyConstructor {
//	
//	public static void main(String[] args) {
//		
//		Vehicle car = new Vehicle();
//		System.out.println("wheels:" + car.wheels);
//		
//	}
//	
//
//}

//output
//wheels:4

//parametriced methods

//class Vehicle{
//int wheels;
//int headLight;
//
//Vehicle(int noOfWheels)
//{
//	noOfWheels=wheels;
//	headLight=2;
//	
//}
//}
//public class MyConstructor{
//
//public static void main(String[] args) {
//	// TODO Auto-generated method stub
//
//	Vehicle car =  new Vehicle(4);
//	Vehicle truck =  new Vehicle(8);
//	
//	System.out.println("car wheels " + car.wheels+" and headlight " + car.headLight);
//	System.out.println("truck wheels " + truck.wheels+" and headlight " + truck.headLight);
//}
//}

//output
//car wheels 0 and headlight 2
//truck wheels 0 and headlight 2

//constructor Overloading

class Vehicle
{
	int wheels; int headLight; String color;
	
	Vehicle(int wheels)
	{
		this.wheels=wheels; headLight=2;
	}
	
	Vehicle(int wheels, String color)
	{
		this.wheels=wheels; this.color=color;
	}
}
public class MyConstructor{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle car = new Vehicle(2);
		Vehicle erickshaw = new Vehicle(3, "Yellow");
	
		System.out.println(erickshaw.wheels+" wheels and color " + erickshaw.color);
	}
}

//output
///3 wheels and color Yellow


//// 		Interview: after making a cons of a class, can u call a default const for the same class.
//// NO.
//but if u still want to.
//line 133 Vehicle random = new Vehicle();// this will give error but if make default const then it will not.
//Like:  Vehicel() {}  in class Vehicle
//
