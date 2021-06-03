package whileLoop;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int n =1;
		do {
			n = sc.nextInt();
			
			System.out.println(n + " greater than 0");
		} while (n!=0);

	}

}


// output

//Enter a number: 
//34
//34 greater than 0
//2
//2 greater than 0
//3
//3 greater than 0
//23
//23 greater than 0
//0
//0 greater than 0
