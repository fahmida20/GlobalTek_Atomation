package globalTek.usa.inherritance;

public class classC extends classB {
	
	public void getNewJob() {
		System.out.println("I have a new job");
		
	}
	
	public static void main(String[] args) {
		classC obj = new classC();
		obj.getNewJob();
		obj.getCar();
		obj.getSalary();
		obj.getCash();
		obj.getProperties();
		
		
	}
	
		
	}
