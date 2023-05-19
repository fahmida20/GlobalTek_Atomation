package code.ny.practice;

import java.util.ArrayList;
import java.util.Collections;

public class SortOrganizeValue {
	public static void main(String[] args) {
		ArrayList<String>name = new ArrayList<String>();
		name.add("Tawhid");
		name.add("Afsana");
		name.add("Mariyam");
		name.add("Shadat");
		
		Collections.sort(name);
		for(String sort: name) {
			System.out.println(sort);      //Alphabetically printout descending order
		}
	}

}
