package whileLoop;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int sumCheck = 0;
		
		int temp = n;
		while (temp > 0) {
			int lastDigit = temp%10;
			sumCheck = sumCheck * 10 + lastDigit;
			temp /= 10;
		}
		if (sumCheck == n) {
			System.out.println("It is a Pallindrome nuber");
		} else {
			System.out.println("Not a pallindrome");
		}

	}

}

//output 

//Enter a number: 
//122343221
//It is a Pallindrome nuber

//Enter a number: 
//758475
//Not a pallindrome
