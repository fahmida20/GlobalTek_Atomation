package code.ny.practice;

import java.util.Arrays;

public class CompareArrays {
	//How to compare two/three Arrays?

	public static void main(String[] args) {
		
	int[]num1 = {1,2,3,4,5};
	int[]num2 = {2,3,6,7,8};
	int[]num3 = {1,2,3,4,5};
	
	if(Arrays.equals(num1,num2)) {
		System.out.println("Value is same in num1 & num2");
	}
	if (Arrays.equals(num2, num3)){
		System.out.println(" Value is same in num2 & num3");
	}
	
	else if (Arrays.equals(num3,num1)){
		System.out.println("Value is same in num3 & num1");
		}
	else {
		System.out.println("Value is not same between Arrays");
	}
	}
  
}
