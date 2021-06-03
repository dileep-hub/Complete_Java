package whileLoop;

import java.util.Scanner;

public class NumberOfDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		int numOfDigits = (int)Math.log10(n) + 1;
		System.out.println(numOfDigits);
	}

}
