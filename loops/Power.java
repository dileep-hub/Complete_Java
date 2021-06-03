package loops;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int b = sc.nextInt();
		
		int result = 1;
		for(int i=1;i<=b; i++  ) {
			System.out.println(result);
			result = result * a;
		}
		System.out.println("Result:->" + result);

	}

}

// Output

//Enter 1st number: 
//5
//Enter 2nd number: 
//5
//1
//5
//25
//125
//625
//Result:->3125