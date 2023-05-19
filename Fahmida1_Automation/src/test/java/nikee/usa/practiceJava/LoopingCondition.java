package nikee.usa.practiceJava;

public class LoopingCondition {
	
	
	//Basic Loop
	public static void getBasicloop() {
		int num = 100;
		for (int i=0; i<num; i++) {
		System.out.println(i);	
		}
	}

	//Decrement value
	public static void getDecrementValues() {
	
		for (int i= 100; i>0; i--) {
			System.out.println(i);
		}
	}
	
	
	//Advance For Loop/Enhance Loop
	public static void getAdvanceforloop() {
		int num[] = {100, 90, 80, 70, 60};
		for (int newValue:num ) {
			System.out.println(newValue);
		}
		
		
	}
	
	//While Loop (dnt use it computer will crash)
	public static void getWhileLoop() {
		int num=0;
		while(true) {
			System.out.println(num);       //here is no specific data
			num++;
		}
	}
	
	
	
	
	
	//Break Statement
	public static void getBreakStatements() {
		
		for(int i = 0; i<100; i++) {
			if(i==10) {
				break;
				}
			System.out.println(i);
		}
	}
	
	
	//Continue Statement:
	public static void getContinuousStatements() {
		for (int i=0; i<100; i++) {
			if(i==10) {                //if we dnt need 10, we use continue statement.
				continue;
				}
			System.out.println(i);
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		//getBasicloop();
		//getDecrementValues();
		//getBreakStatements();
		//getAdvanceforloop();
		getContinuousStatements();
		
		
		
		
		
	}
	
	
}
