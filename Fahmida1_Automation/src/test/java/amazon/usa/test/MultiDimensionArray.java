package amazon.usa.test;

public class MultiDimensionArray {

	public static void multiArray() {
		int num[][]= {{10,20,30},        //multi means two dimension two curly open, two curly close
				      {30,40,50,70}};
		System.out.println(num[1][3]);     // for column number (Top to bottom)1= 0,1 and row (left to right)0,1,2.. 
		}
	
	public static void main(String[] args) {
		MultiDimensionArray.multiArray();       
	} 
	} 

