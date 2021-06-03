package Strings;

public class StringsIntro {

	public static void main(String[] args) {
		
		String name = "dileep1";     // literal way here "dileep" is a literal value and stores it in string pool
		System.out.println(name);
		
		String anotherName = new String("dileep1"); // here this is object way it creates value in both heap and string pool
		System.out.println(anotherName);
		
		System.out.println(name == anotherName);   // it wll be false
				
		name = "kumar";
		System.out.println(name);  // hence it is immutable
		
		// charAt()
		System.out.println(name.charAt(2));
		
		String name3 = "Hi this is dileep";
		// lengh()
		System.out.println(name.length());
		
		//substring
		System.out.println(name3.substring(5));
		System.out.println(name3.substring(1, 8));
		
		// contains
		System.out.println(name3.contains("this"));
		
		// isEmpty()
		System.out.println(name.isEmpty());
		
		// equals
		System.out.println(name.equals(anotherName));
		
		// concat
		System.out.println(name.concat(" kumar SR"));
		
		//replace
		System.out.println(name3.replace('e', 'a'));
		
		
		String name4 = "dog,cat,rat,bat,pet";
		String pets[] = name4.split(",");
		// split
		for (String pet : pets) {
			System.out.println(pet);
		}
		
		// indexOf
		System.out.println(name3.indexOf("i"));
		
		// toLowerCase()
		System.out.println(name4.toLowerCase());
		
		// toUpperCase()
		System.out.println(name4.toUpperCase());
		
		//trim()
		String name5 = "    hi    i  am   fine   ";
		System.out.println(name5.trim());
				
		
	}

}



//output

//dileep1
//dileep1
//false
//kumar
//m
//5
//is is dileep
//i this 
//true
//false
//false
//kumar kumar SR
//Hi this is dilaap
//dog
//cat
//rat
//bat
//pet
//1
//dog,cat,rat,bat,pet
//DOG,CAT,RAT,BAT,PET
//hi    i  am   fine