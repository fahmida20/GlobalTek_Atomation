package amazon.usa.test;

public class BreakStatement {
	
	public static void main(String[] args) {
		int num = 100;
		for(int i =0; i<100; i ++) {
			if (i==5) {
				break;               //in order to stop the loop break the loop
			}
			System.out.println(i);
		}
	}
}
