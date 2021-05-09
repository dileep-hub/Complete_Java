package DataTypes;

public class DataTypesTutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 126;
		//byte b = 1234; get error byte range [-128 - 127]
		short s = 12345;  //range [2^-15 to a^15]
		int i = 123;      //range [2^-31 to 2^31]
		long l = 1352452;      //range [2^-63 to 2^63]
		float f = 2.3f; 
		
		double Rate = 3.3333333333333;
		boolean isThis = true;
		
		char myChar = '$';
		System.out.println(myChar);
	}

}
