package arrays;

import java.util.Scanner;

public class MatrixAddtion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number of rows and colums: ");
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		
		int a[][] = new int[rows][cols];
		int b[][] = new int[rows][cols];
		
		System.out.println("enter array a: ");
		for (int i=0; i<rows; i++) {
			for (int j=0; j<cols; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("enter array b: ");
		for (int i=0; i<rows; i++) {
			for (int j=0; j<cols; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		
		int c[][] = new int[rows][cols];
		for (int i=0; i<rows; i++) {
			for (int j=0; j<cols; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		System.out.println("Addition Matrix: ");
		for (int i=0; i<rows; i++) {
			for (int j=0; j<cols; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
			
	}

}
}	


//output

//enter number of rows and colums: 
//2 3
//enter array a: 
//1 2 3 
//4 5 6
//enter array b: 
//6 7 8
//4 3 2
//Addition Matrix: 
//7 9 11 
//8 8 8 

