package conditionalStatements;

public class SwitchCaseStatements {

	public static void main(String[] args) {
		
		int weekDay = 3;
		
		switch(weekDay) {
		case 1:
			System.out.println("i am at school");
			break;
		case 2:
			System.out.println("i am at groud");
			break;
		// here for both case 3 and 4 we get output the same [movie]
		case 3:
		case 4:
			System.out.println("i am at movie");
			break;
		default:
			System.out.println("i am at home");
			
			
			
		}
	}

}
