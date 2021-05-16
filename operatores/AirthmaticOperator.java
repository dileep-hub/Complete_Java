package operatores;

public class AirthmaticOperator {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
//1		int c = a * a + b * b + 2 * a * b;  // use BODMAS rule
//2		double c = b/a;
//3     double c = (double)b/(double)a;
		
//4		int c = a-1;
		int c = ++a;
		
//123	System.out.println(c);
		System.out.println(c + " " + a);

	}

}



//OUTPUT

// 1 ==> 5
// 2 ==> 1.0
// 3 ==> 1.5

// 4 ==> 1 2  does change only in c

// last ==> 3 3   does change in both a and  c 
