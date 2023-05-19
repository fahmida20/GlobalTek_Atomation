package amazon.usa.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class loop_test {
	
	
   public static void main(String[] args) {
	
	   ArrayList<String>list2= new ArrayList<String>();  //how to declare Arraylist/
	   list2.add("Afroza");
	   list2.add("Shammy"); 
	   list2.add("Farhana");
	   
	  
	   for(String newValue:list2) {    //Advance loop   i cant use basic loop because that is integer
		  
		  // System.out.println(newValue);
		   
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   LinkedList<Integer>list4= new LinkedList<Integer>();
	   
	   Vector<Integer>list6 = new Vector<Integer>();
	   
	   
	   ArrayList<Integer> list = new ArrayList<Integer>();    
	   list.add(39);
	   list.add(20);
	   list.add(50);
		
	   for(int i=0; i<list.size(); i++) {
		   System.out.println(list.get(i));
	   }
	  
			
			
			
			
			
			
   }	
}


