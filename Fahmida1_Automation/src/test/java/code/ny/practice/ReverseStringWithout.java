package code.ny.practice;

public class ReverseStringWithout {
  // How to reverse String without function from  Array?
	
	public static void main(String[] args) {
		String rev = "Infosys";   //declare a String variable
		String revString = " ";
		for (int i = rev.length()-1; i>=0; --i) { //decrease the value help of loop concept
			revString += rev.charAt(i);    ///call charAt method which can breakdown all String i am storing the value
		}
		System.out.println(revString);
		}
	}
