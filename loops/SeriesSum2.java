package loops;

import java.util.Scanner;

public class SeriesSum2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		float result = 0;
		
		for(float i = 1; i <= n; i++) {
			if (i%2 == 0) {
				result -= 1/i;
			} else {
				result += 1/i;
			}
		}System.out.println("Series[1-1/2+1/3-1/4..." + result);

	}

}

//output
//Enter a number: 
//8
//Series[1-1/2+1/3-1/4...0.6345238