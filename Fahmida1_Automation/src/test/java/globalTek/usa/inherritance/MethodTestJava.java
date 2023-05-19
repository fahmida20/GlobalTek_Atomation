package globalTek.usa.inherritance;

public class MethodTestJava {
	
	 int salary;      //instance variable 1st we create then we can write after public void method
     String name; 
	 
     static int salary1;
     static String name1;
     static String departments; 
	 
	
	
	public void getSalary() {        //void/return+get method name(){}
	   salary = 100000;
	   System.out.println("Employee salary:" + salary);
		}
	
	public void getEmployees() {
		 name = "rafat"; 
		 System.out.println("Employee name:"+ name);
		
	}
	
	public static void getDepartment() {  
		salary1 = 125000; 
		name1 = "Nancy";
		departments= "QA Automation Engineer";
		
	}
		public static void getEmpInfo(String name1, int salary1) { //static and parameter method
			System.out.println("Employee name1:"+ name1);
			System.out.println("Employee salary1;" + salary1);
			
		}
		
		
	
	
	public static void main(String[] args) {
		MethodTestJava obj = new MethodTestJava(); // for void method i can call by obj name
				obj.getEmployees();
		        obj.getSalary();
		        
		        MethodTestJava.getEmpInfo("nancy", 125000); 
		        MethodTestJava.getEmpInfo("rafi", 100000);
		        MethodTestJava.getEmpInfo("nilli", 200000);
				// for static method i can by class name and its parameter method
				
		        
		        
	}
	
	
		
		
	}

