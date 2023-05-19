package zoopla.usa.login;

public class MethodTestJava {

  static  int salary;      //instance variable
   static String name;
  static  String departments;
    
	public	void getSalary() {	//instance variable,start with get
		salary = 100000;
		System.out.println("Employee salary:"+salary);
	}	
	//how you can call void method?
  public void getEmpoyees() {
	  name = "rafat";
	  System.out.println("Employee name:"+name);
	  
	 
 }	
  public static void getInfo(String name, int salary) {
	  System.out.println("Employee salary:"+ salary);
  }
  
  
  
 //how you can call the static method?
  public static void getDepartments() {   //static void method
          salary= 100000;
          name= "rafat";
          departments= "QA Automation Engineer"; //i cannot put non static method under static method
                                                  //static method only handle static variable
          }
  public static void getEmpInfo(String name,int salary) {
	  System.out.println("Employee name:"+ name);
	  System.out.println("Employee Salary:"+ salary);  // parameter method
	  
  }
  
	//in order to call void method i have to create a object
     public static void main(String[] args) {
		  //main+ctrl+space+enter
    	 MethodTestJava obj = new MethodTestJava();
    	 obj.getEmpoyees();
    	 obj.getSalary();
    	
    	 MethodTestJava.getDepartments();// whats it?
    	 MethodTestJava.getEmpInfo("rafat", 100000);
    	 MethodTestJava.getEmpInfo("Arman", 150000);
    	 MethodTestJava.getEmpInfo("Emon",105000);
         
     }
}
