package conditionalStatements;

public class NestedIfElse {

	public static void main(String[] args) {
		
		int a=122, b=135, c=190;
		int result = 0;
		
		if (a>b) {
			if (a>c) {
				result = a;
			} else {
				result = c;
			}
		} else {
			if (b>c) {
				result = b;
			} else {
				result = c;
			}
		}
		System.out.println("Greatest of all is " + result);
	}

}
