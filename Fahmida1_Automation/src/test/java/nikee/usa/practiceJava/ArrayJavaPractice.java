package nikee.usa.practiceJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayJavaPractice {

//single dimension array	
 public static void singleVariable() {
	     int num = 10;
		    num = 20;
		    num = 30;
	        num = 40;
	        System.out.println(num);      //java can handle one value, they cannot handle multiple value
}       
	
  public static void declareSingledimensionArray() {
		int num [] = {10,20,30,40,50};
		System.out.println(num[2]);	}
   
  // public static void main(String[] args) {
	//ArrayJavaPractice.declareSingledimensionArray();              }

   
   public static void declareMultidimensionArray() {
		int num [][] = {{10, 20, 30, 40, 50},
		                {60, 70, 80, 90, 100},
		                {100,120,130,140,150}};
		
	System.out.println(num[2][3]);	
		
		}
   
  // public static void main(String[] args) {
	   
	 //  ArrayJavaPractice.declareMultidimensionArray(); }
   
   public static void getMaxValue() {           //for getting max value
	   List<Integer>values = new ArrayList<Integer>(Arrays.asList(100,200,300,400,500));
	     int max = Collections.max(values);
	     System.out.println(max);
	   
   }
   
  // public static void main(String[] args) {
	//   ArrayJavaPractice.getMaxValue();}
				

   public static void getSpecificValue() {     //for getting specfic value
	   ArrayList<String>name = new ArrayList<String>();  //declare ArrayList with some values
	   name.add("Arman");
	   name.add("Afsana");
	   name.add("Nisan");
	   name.add("Ash");
	   
	   if (name.contains("Afsana")) {               // we use if else condition find out specific name, we use the contains method.
		   System.out.println("Afsana is present");   //contain method pass it is true or false
		   }
	   else {
		   System.out.println("Afsana is not present");
	   }
	   
	 }
   
  // public static void main(String[] args) {
	//ArrayJavaPractice.getSpecificValue();}
   
  
   
   public static void getSortValue() {
	   ArrayList<String>name = new ArrayList<>();    // sort/organize the value first i create a ArrayList with some Values
	   name.add("Tawhid");
	   name.add("Fahmi");
	   name.add("Fardeen");
	   name.add("Faiza");
	   
	   Collections.sort(name);    // sort/ organize name Alphabetically we need to Descending the order
	   
	  for (String sort: name) {
		  System.out.println(sort);    //if we try to print out we store by using for loop concept
	  }
	  }
  // public static void main(String[] args) {       //execute my code
	// ArrayJavaPractice.getSortValue();}
   
   
  public static void getCompareValue() {
	  int[]num1= {1,2,3,4,5};                     //create multiple arrays with multiple values
	  int[]num2 = {1,2,3,5,6};
	  int[]num3 = {1,2,3,4,5};
	  
	  if (Arrays.equals(num1, num2)) {       // compare between three values with help of if else condition
		System.out.println("Value is same");
	  }
	  
	  if (Arrays.equals(num1, num3)) {
		  System.out.println(" value is same");
		  }
	  
	  else {
		  System.out.println("Value is not same");
		  
	  }
	 }
  
 // public static void main(String[] args) {
	//ArrayJavaPractice.getCompareValue();}
  
 
  public static void getSplitWord() {   // how to get split word in Java?
	  
	  String word = "United States of America";   //declare with the String with value
	    String[] wd = word.split(" "); // help of split method i break down the word, store it in Arrray object
	   
	    for (String key: wd) {         //there are multiple string so i do looping
	    	System.out.println(key);
	    }
  }
  
  public static void main(String[] args) {
	ArrayJavaPractice.getSplitWord();
}
  
   

}





