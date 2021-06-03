package whileLoop;

import java.util.Scanner;

public class SumOfDigits {
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int n = sc.nextInt();
			
	int temp = n;
	int sumOfDigit = 0;
	
	while (temp > 0) {
		int lastDigit = temp%10;
		sumOfDigit += lastDigit;
		temp = temp/10;
	}
	System.out.println("sum of digits of " + n + " is " + sumOfDigit);
	}

}

//output

//Enter a number: 
//8474
//sum of digits of 8474 is 23
