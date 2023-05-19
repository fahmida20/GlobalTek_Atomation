package code.ny.practice;

import java.util.HashSet;
import java.util.Set;

public class FindDplicatValueBySet {    // set interface allow only unique values, it doesnt allow duplicate values
	public static void main(String[] args) {
		String [] name = { "Selenium", "Java", "Mavan", "JDBC", "Java"};
		Set<String> setValue = new HashSet<String>();
		
		for(String newValue: name) {
			if (setValue.add(newValue)== false) {    //if i write here True than all value will come. 
				System.out.println(newValue);	
			}
			
		}
	}

}
