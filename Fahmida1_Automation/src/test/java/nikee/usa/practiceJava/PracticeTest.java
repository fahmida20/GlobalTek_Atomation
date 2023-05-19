package nikee.usa.practiceJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeTest {                   //first i create a class,
	
	
	
	
	public static void getMinValue() {         //i create a static method
		List<Integer>values = new ArrayList<Integer>(Arrays.asList(100,200,300,400));   //i declare a value inside List
		int min = Collections.min(values);         //help of java collection class i call min method, pas the min value,
		                                            //store it in int variable
		System.out.println("This is my minimum values:"+ min); //for print out i call arguments then i can get value
	}
	//public static void main(String[] args) {       //we want to see result in console so i call the main method and call by class name i can 
		                                           //get the result
	//	PracticeTest.getMinValue();
	//}

	
	
	
	public static void removeDuplicate() {     //foundout duplicate from Arraylist
		
		List<Integer>remove = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,3,6,5));   //i have to declare duplicate & multiple values inside a list
		
		List<Integer>uniqueValue = remove.stream().distinct().collect(Collectors.toList()); 
		
		//with the help array list object i can call stream distinct collect method
		//And store in List of instance
		
	    System.out.println(uniqueValue);
		//with the help list instance i can print out the value 
		
			}

	//public static void main(String[] args) {
		//PracticeTest.removeDuplicate();}
	
	
	
	public static void getNestedloop() {       //findout duplicate from Array 
		
		String[]names = {"Java", "JavaScript","Pythone", "C++", "Java", "Ruby"};   //declare an String array there is duplicate value in order to find duplicate value,
		for (int i=0; i<names.length; i++) {       //i create a one loop 
		for (int j=i+1; j<names.length; j++) {        // inside loop we create another loop
			if (names[i].equals(names [j])) {       //help of if condition there is equal method there we can compare it
				
			System.out.println(names[j]);      // we can print out either i can use i or j value
			
			}}}}
	//public static void main(String[] args) {
		//PracticeTest.getNestedloop();}
	
	
	
	public static void secondHighestNumber() {
		int[]num = {2,4,6,8,9};      //declare an array
		int size = num.length;       //array object is num, with help of it i call length and store it in size reference variable
		Arrays.sort(num);            //i use sort method bring value by Ascending way
	
		int result = num[size -2];   // i call num object and pass the arguments inside like variable subtract whatever number i need
		                             //then i store it in one reference variable
		
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		PracticeTest.secondHighestNumber();     //this is static method so i call it by class name, want to execute the code
	}
	
	

	
	
	
	
}


