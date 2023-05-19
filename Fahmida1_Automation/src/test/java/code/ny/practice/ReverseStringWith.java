package code.ny.practice;

public class ReverseStringWith {
	//How to remove String with function?
	
	public static void main(String[] args) {
		
	String rev = "infosys";
	StringBuilder sb = new StringBuilder(rev);   // help of StringBuilder class i call reverse.to string method
	String rev1 = sb.reverse().toString();   //store it in reverse reference variable
	System.out.println(rev1);
	}
}
