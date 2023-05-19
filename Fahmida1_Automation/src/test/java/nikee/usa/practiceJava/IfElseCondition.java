package nikee.usa.practiceJava;

public class IfElseCondition {

	public static void main(String[] args) {
		int num =10;     //declaring
		
		if(num  == 10) {     //comparing
		System.out.println(num);
		}
		
		
		if (num > 9) {
		System.out.println("Num is greater than 9:="+ num);
		}
		
		else if (num < 9) {
			
			System.out.println("Num is less than 9:="+ num);
		}
		
        else if (num == 9) {
			
			System.out.println("Num is equal 9:="+ num);
		}
		else {
			System.out.println("Num is empty:="+ num);
		}
			
		}
	}



