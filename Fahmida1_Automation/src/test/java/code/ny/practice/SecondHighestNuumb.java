package code.ny.practice;

import java.util.Arrays;

public class SecondHighestNuumb {
	//Declare 2nd highest number from Array
	
	public static void main(String[] args) {
		int[]number = {1,2,3,4,5,6};
		int size = number.length;   //Array use the length
		Arrays.sort(number);
		int result = number[size -2];
		System.out.println(result);
		
	}

}
