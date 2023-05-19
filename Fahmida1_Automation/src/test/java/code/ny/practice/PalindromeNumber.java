package code.ny.practice;

public class PalindromeNumber {
	public static void main(String[] args) {
		
		// How to find out palindrom number without function(Reverse the String)
		//is it palindrome number or not?
		
		String rev = "MOM";
		String revString = " ";
		for(int i=rev.length()-1; i>=0; --i){
			revString += rev.charAt(i);
		}
		if (revString.equals(rev)) {
			System.out.println("This is a palindrome word:"+ revString);
		}
		else {
			System.out.println("This is not a palindrome word:"+ revString);
		}
	}
	
	

}
