package amazon.usa.test;

import java.util.Arrays;

public class bas_lop1 { 
	 
//	int a[] = {10,20,30};
//	int a1[][]= {{10,20,30},
//	               {3,9,10,50},
//	             {20,60,70}};
	
	
	
	public static void main(String[] args) {
		
//		int a = 0;
//		a = 10;
//		a = 20;
//		a = 30;
//		System.out.println(a);
		
//		int num = 100;
//		for(int i=0; i<num; i++) {
//			System.out.println(i);
//		}
		
	int numbers[] = { 10, 3, 67, 88, 44, 34, 55, 23, 67, 1 };
		// System.out.println(Arrays.toString(numbers));    ///all value show number list
	for (int i = 0; i < numbers.length; i++) {
		// System.out.println(numbers[i]);             // i can get whole list number by loop
	}
	
	
	//Advance loop
	int numbers1[] = { 10, 3, 67, 88, 44, 34, 67, 1 };
	for (int num : numbers1) {
		//System.out.println(num);
		
	}

}
}
