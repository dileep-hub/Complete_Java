package methods;

public class JavaIsAlwaysPassByValue {

	public static void main(String[] args) {
		
		int c = 4;
		int d = 6;
		
		// swap is just a function like maxOf it dont change the value of c and d
		swap(c,d);
		System.out.println(c + " " + d);
      //System.out.println(a + " "+ b); will give error here as scope of a and b is not here.
		
		
		// in primitive datatypes it is pass by value not in non primitive [class]
	}
	static void swap(int a, int b) 
	{
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a + " " + b);
	}
}

////output
//6 4
//4 6
