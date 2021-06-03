package conditionalStatements;

public class TernaryClass {

	public static void main(String[] args) {
		
		int a = 55;
		int b = 19;
		
		int maxOfBothNumbers = 0;
		
		
		// below condition is if a > b then print a else print b
		// so we use ? here
		maxOfBothNumbers = a>b ? a : b;
		System.out.println("max of both is "  + maxOfBothNumbers);
	}

}
