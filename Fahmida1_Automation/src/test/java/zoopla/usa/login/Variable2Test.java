package zoopla.usa.login;

public class Variable2Test {
	//Instance variable
		String name;
		int salary;
		String designation;
		
		//Static/Global/Class variable
	public static String name2;
		static int income;
		static String food;
		
		
	    public void getSalary() {
	    	name = "Ali";
	    	salary= 10000;
	    	designation= "Automation Engineer";
	    	food = "sweet";
	    }
	   
	    
	    public static void getEmp() {    //static variable use only in any method
	    	name2= "Amin";
	    	income = 9000;
	    	
	    }
		
	    public static void main(String[] args) {
			
	    	//local variable //we can not use local variable in other class/method
	    	String empName1;
	    	empName1= "Mahir";
	    	int empSalary;
	    	empSalary= 8000;
	    	System.out.println(empName1 );
		}

}
