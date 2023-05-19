package code.ny.practice;

import java.util.ArrayList;

public class SpecificValue {
	// how to find out specific value from ArrayList?
	
 public static void main(String[] args) {
	ArrayList<String>name = new ArrayList<String>();
	name.add("Tawhid");
	name.add("Afsana");
	name.add("Mariyam");
	name.add("Shadat");
	
	if (name.contains("Afsana")) {
		System.out.println("Test pass & Afsana present");
	}
	else {
		System.out.println("Afsana not present & test failed ");
		}
	
	
}
}
