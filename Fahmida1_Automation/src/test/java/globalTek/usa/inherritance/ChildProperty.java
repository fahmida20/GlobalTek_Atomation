package globalTek.usa.inherritance;

public class ChildProperty implements DadProperty, StepDad{
	
	// when i write implements then auto suggest add un implement method
	
	public void getJob() {
		System.out.println("Child get new Software Engineering job");
	}

	public void getCar() {
		System.out.println("this is my BMW new car");
	}

	public void getMoney() {
		System.out.println("This is my cash and i want to buy a new flat");
		
	}

	public void getBuilding() {
		System.out.println("this is my building and i start a new office");
	}

	public void getGold() {
		System.out.println("This is my Gold");
	}
	
	
	public static void main(String[] args) {
		ChildProperty obj = new ChildProperty();
		obj.getGold();
		obj.getBuilding();
		obj.getMoney();
		obj.getMoney();
		obj.getCar();
		obj.getJob();
				
	}
	

}
