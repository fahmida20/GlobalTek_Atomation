package amazon.usa.test;

public class SwapingValues {
// swap means change value of one variable to another variable. there is many ways like 
	// help with third variable or without third variable we can swap value

public static void main(String[] args) {
	int a = 10;   
	int b = 20;
	int result;    //here result is third variable
	result = a+b;
	               // what is a value?

      a = result - a;
    //  System.out.println("After swaping a value is:"+ a);
      
      b = result - b;
    //  System.out.println("After swaping b value is:"+ b);
      
      
     // Without third variable(Swap)
      
      int a1 = 100;
      int b1 = 200;
      
      a= a1+b1;     //a value
      a = 100+200;
      
      b = a-b1;             //a=a1+b1, left is valua a and value b no change right side only change put value
      a = a-b;             //b=a-b1, a=a-b
      
     System.out.println(b); 
     System.out.println(a);      //java code understand line by line one after another
      
    		  
      
}

}
