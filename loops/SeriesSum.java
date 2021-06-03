package loops;

import java.util.Scanner;

public class SeriesSum {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		float result = 0;
		
		for(float i=1; i <= n; i++) {
			result = result + 1/i;
		}
		
		System.out.println("Series sum(1/i + 1/i+1 +.. +1/i+n) => " + result);
}
}

//output

//Enter a number: 
//6
//Series sum(1/i + 1/i+1 +.. +1/i+n) => 2.4500003