package globalTek.usa.inherritance;

public class classB extends classA {   //this is Parent property
     public void getCar() {
    	 System.out.println("I have a BMW car");
     }
     
     public void getSalary() {
    	 System.out.println("I get $100000");
     }
     
     public static void main(String[] args) {
		classB obj = new classB(); 
		obj.getCar();
		obj.getSalary();
		obj.getProperties();
		obj.getCash();
	}
}
