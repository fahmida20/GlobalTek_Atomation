package amazon.usa.test;

public class IfElseCondition {
	
	// How to verify expected result from your codes?
		//with the help of conditional statement or if else condition i verify the expected result
		
		public static void main(String[] args) {
			int num = 10;
			if (num == 10) {   //comparing value
				System.out.println(num);
			} 
			if (num>9) {
				System.out.println("Num is greater than 9 :"+ num);
			}
			else if (num<9) {
				System.out.println("Num is less than 9 :"+ num);
				}
			else {
				System.out.println("Num is empty:"+ num);
			}
			
			
		}
// First i check first condition, if first condition is no satisfy than come to the 2nd condition, 
		//if 2nd condition is no satisfy than come to 3rd condition

}
