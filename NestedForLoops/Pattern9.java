package NestedForLoops;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		
		System.out.println("* ");
		
		for  (int i=2; i<=n-1; i++ ) {
			System.out.print("* ");
			
			for(int j=1; j<=i-2; j++) {
				System.out.print("  ");
			}
			
			System.out.print("* ");
			System.out.println();
			
		}
		for(int k=1; k<=n; k++) {
			System.out.print("* ");
		}
	}

}


//output 
//
//Enter number: 
//6
//* 
//* * 
//*   * 
//*     * 
//*       * 
//* * * * * * 