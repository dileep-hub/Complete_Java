package loops;

public class ForLoops {

	public static void main(String[] args) {

//		for(int i = 0; i < 100; i = i+2) {
//			System.out.println("Hello world " + i);
//		}
		
		int sum = 0;
		int n = 5;
		for(int i=1; i<=n ;i++ ) {
			sum = sum + i;
		}
		System.out.println("sum is " + sum);
	}

}


// OUTPUT  : 1 3 5 .. 99

			 