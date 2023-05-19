package amazon.usa.test;

public class ContinueStatement {
	
	public static void main(String[] args) {
		int num = 100;
		for(int i=0; i<100; i++) {
			if (i == 10) {
				continue; 
				
			}
			System.out.println(i);
		}
		
	}      // if i dont want to see number or skip the number 10, 
	       //then i need continue statement i can ignore some specific number

}
