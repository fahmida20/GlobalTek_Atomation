package amazon.usa.test;

import java.util.ArrayList;
import java.util.Arrays;

public class DeclareArrayList {
	
	public static void main(String[] args) {
		
	
	// How to declare arraylist or list? ArrayList is class implement from List interface
	ArrayList list= new ArrayList();    //dont need this formula use 2nd one//it is non generic code
	list.add("Aleya");
	list.add(100); 
	list.add(null); 
	for (int i = 0; i<list.size(); i++) {      //here we use only for loop     
		//System.out.println(list.get(i));
	}
	
	ArrayList<Integer>list1= new ArrayList<Integer>();   //2nd way Int  // generic code we use now
	list1.add(101);
	list1.add(30);
	
	
	ArrayList<String>list2= new ArrayList<String>();  ///for String name  //inside angle bracket we put String
	list2.add("Ramisa");                                //for LinjedList and vector we change the class name.
	list2.add("yftdchchg");
	for(String value: list2) {
		//System.out.println(value);        //basically loop we use for breakdown value one by one
		
	}
	
	ArrayList<String>list3= new ArrayList<String>(Arrays.asList("Mami", "vabi"));    //standard way..use korbo
	for (String value: list3) {
		//System.out.println(value);
	}
	
	  ArrayList<Integer> list4 = new ArrayList<Integer>();    
	   list4.add(39);
	   list4.add(20);
	   list4.add(50);
		
	   for(int i=0; i<list4.size(); i++) { 
		   System.out.println(list4.get(i));
	   }
	  
			
	
	
	
	
	
}
}
