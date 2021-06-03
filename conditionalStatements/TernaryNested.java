package conditionalStatements;

public class TernaryNested {

	public static void main(String[] args) {
		int a = 122, b=1344, c=47;
		
		int result = 0;
		result = a > b ? a > c ? a : c : b > c ? b : c;
		
		System.out.println("Greatest of all is " + result);
		

	}

}
