package arrays;

import java.util.Scanner;

public class AvgMarksOfStudents {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of subjects : ");
		int n = sc.nextInt();
		
		int marks[] = new int[n];
		
		System.out.println("Start entering marks: ");
		for (int i=0; i <n ; i++) {
			marks[i] = sc.nextInt();
		}
		
		int avg=0;
		
		for (int j=0; j<n; j++) {
			avg += marks[j]; 
		}
		
		avg /= n;
		System.out.println("The avg marks of the  student is " + avg);
	}

}


//output 

//Enter total number of subjects : 
//4
//Start entering marks: 
//78
//98
//87
//88
//The avg marks of the  student is 87
