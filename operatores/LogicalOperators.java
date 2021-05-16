package operatores;

public class LogicalOperators {
	
	public static void main(String[] args) {
		
		int num =  30;
		
		// used && operator
		if(num >= 1 && num <= 100) {
			System.out.println("number is in range 1-100");
		}
		
		
		// used || operator
		int grade1 = 12;
		if(grade1 == 10 || grade1 == 12) {
			System.out.println("you are eligible for board exam");
		}
		
		
		// used ! operator
		int grade2 = 11;
		if(!(grade2 == 10 || grade2 == 12)) {
			System.out.println("you are not eligible for board exam");
		}
		
	}

}
