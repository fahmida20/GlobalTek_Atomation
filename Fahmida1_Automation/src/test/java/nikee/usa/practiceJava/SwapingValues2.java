package nikee.usa.practiceJava;

public class SwapingValues2 {
	
	
	public static void main(String[] args) {
		
		// without third variable
	     
		  int x= 100;
	      int y = 200;
	       x= x+y;
	       y= x-y;
	       x= x-y;
	       
	       System.out.println("After swaping y value is:"+ y);
	       System.out.println("After swaping x value is:"+ x);
	       
	}
	
       

}
