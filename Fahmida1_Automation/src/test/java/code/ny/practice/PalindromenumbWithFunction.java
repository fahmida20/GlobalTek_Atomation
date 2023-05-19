package code.ny.practice;

public class PalindromenumbWithFunction {
	
	//palindrome number with function
	public static void getPalindromeNumber() {
		String rev = "LEVEL";
		StringBuilder name = new StringBuilder(rev);
		String rev1 = name.reverse().toString();
		if (rev1.contains(name)) {
			System.out.println("This is a palindrome number:"+ rev1);
			
		} 
		else {
			System.out.println("This is not a Palindrome number");
			
		}
		}
	public static void main(String[] args) {
		PalindromenumbWithFunction.getPalindromeNumber();
	}

}
