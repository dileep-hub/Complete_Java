package encapsulations;

public class EncapsulationsIntro {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		//s1.name = "tom"; // show error coz  it is declared private
		//s1.age = 12;     //  "                                    "
		
		s1.setAge(12);
		System.out.println(s1.getAge());
		
		System.out.println();
		
		s1.setAge(22);
		System.out.println(s1.getAge());


	}

}

//In encapsulation, the variables of a class will be hidden from 
//other classes, and can be accessed only through the methods of their 
//current class.

//output
//12
//
//U are too old to be a student
//12