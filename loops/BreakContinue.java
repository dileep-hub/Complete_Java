package loops;

public class BreakContinue {

	public static void main(String[] args) {
		
//		//break
//		for (int i =1; i<=100; i++) {
//			if (i == 35) {
//				break;
//			}
//			System.out.print(i + " ");
//		}
		
		//continue
		
		for(int i = 1; i <= 20; i++ ) {
			if(i>=10 && i<=15) {
				continue;
			}
			System.out.print(i + " ");
		}
	}

}


//output for break
//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 

//output for continue
//1 2 3 4 5 6 7 8 9 16 17 18 19 20 