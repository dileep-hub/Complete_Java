package oops.Packages;

//this will import Scanner 
import java.util.*;

//import oops.Packages.models.Student;
// To access all the classes inside a package use "*"
import oops.Packages.models.*;

public class MainClass {

	public static void main(String[] args) {
		
		// accessing Student class from package models
		Student obj = new Student("tom");
		obj.name = "cat"; // cannot be changed becoz it is declared private
		
		obj.getName(); // no error as it is declared public
		obj.getPassword; // error as it is declared private
		
		obj.myDefault() // error coz its a default modifier only accessed in that pacakge
		
		
		Teacher obj2 = new Teacher();
		
		// even for Scanner class comes from java.utils before using it we have to import it
		Scanner sc = new Scanner(System.in);
		

	}

}
