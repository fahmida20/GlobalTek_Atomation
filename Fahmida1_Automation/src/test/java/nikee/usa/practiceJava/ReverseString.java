package nikee.usa.practiceJava;

public class ReverseString {
	
	
	// reverseString Without function
	public static void getReverseValue() {    // create a void
		
		String rev = "Infosys";      // declare a string variable
		String revString = "";
		for(int i=rev.length() -1; i>=0; --i) {   //decrease the value help of for loop concept
			revString += rev.charAt(i);   //call charAt method which can breakdown all String i am storing the value
		}
		System.out.println(revString);
		}
   // public static void main(String[] args) {
    	//ReverseString.getReverseValue();}
    
    
    
	//reverseString with function
	public static void getRevValue1() {
		String rev = "Fahmida";        //declare a string name
		StringBuilder name = new StringBuilder(rev);   //with help of StringBuilder object i can call the reverse method
		rev = name.reverse().toString();   // store it in rev reference variable
		System.out.println(rev);    //get the value
		
	}
	// public static void main(String[] args) {
   //  ReverseString.getRevValue1();}




//find out Palindrome number?
	
	public static void getPalindromeNum() {
		String rev = "ufyfu";
		StringBuilder sb = new StringBuilder(rev);
		rev= sb.reverse().toString();       //help of String builder object i can call reverse method,store it in reference value
		if (rev.contains(sb)) {
			System.out.println("This is Palindrome number");
		}
		else {
			System.out.println("This is not a Palindromeme number");
		}
		}
	
	public static void main(String[] args) {
	 ReverseString.getPalindromeNum();
		
	}





}



