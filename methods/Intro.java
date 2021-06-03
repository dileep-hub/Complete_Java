package methods;

//public class
public class Intro {
	// main method
	public static void main(String[] args) {
	
	int a=12, b=59;
	int result = maxOf(a,b);
	System.out.println(result);
	
	System.out.println(maxOf(13,10));
	sayHi();
		
	}
	
	static int maxOf(int a, int b)
	{
		return a>b? a:b;
	}
	// we can create as many function inside a class
	static void sayHi()
	{
		System.out.println("Hi Good Morning");
	}
}


//output
//59
//13
//Hi Good Morning
