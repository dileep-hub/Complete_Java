package operatores;

public class BitwiseOperator {

	public static void main(String[] args) {
		// 5 -> 101
		// 6 -> 110
		// 4 -> 100
		int a = 5;
		int b = 6;
//1 	int c = a&b;
//2		int c = a | b;
		
// 1101 -> 0110 -> 0011 -> 0001 -> 0000 -> 0000 ----> Right shift
//3		int c = a >> 1;
//4		int c = a >> 2;   Right shift
		int c = a << 3;
		System.out.println(c);

	}

}


// OUTPUT
// 1 ==> 4
// 2 ==> 7 
// 3 ==> 2
// 4 ==> 1
// last ==> 40   # 5+5 =10 -> 10+10 =20 -> 20+20 =40