package oops.inheritence;

public class MainClass {

	public static void main(String[] args) {
		
		Teacher t = new Teacher();
		t.name = "Tom";
		t.eat();    //  method  overrindng 
		t.walk();
		t.laughing();
		System.out.println("person is " + t.name);
		
	    Singer s = new Singer();
	    s.name = "pat";
	    s.eat();
	    s.sing();
	    s.laughing();
	    
	    // upcasting   and  downcasting 
	    Teacher t2 = new Teacher();
	    Singer s1 = new Singer();
	    Person p = t2;
	    Teacher t1 = (Teacher)p; // bno error coz even p has a reference to teacher[t1]
	    
	    boolean yo = t2 instanceof Teacher;
	    
	    System.out.println(t instanceof Teacher);
	    System.out.println(s1 instanceof Singer);
	    System.out.println(t instanceof Person);
	    
	    System.out.println(t1 instanceof Person);
	    System.out.println(p instanceof Teacher);
	    
	    // super keyword
	    Teacher t5 = new Teacher();
	    t5.name = "sup";
	    t5.talk();
	}

}
