package code.ny.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMaxMinValue {

	public static void main(String[] args) {
		List<Integer> value = new ArrayList<Integer>(Arrays.asList(100, 200,300,400,500));
		
		int max   = Collections.max(value);
		System.out.println("This is my maximum value:" + max);
		
		int min = Collections.min(value);
		System.out.println("This is my minimum value:" + min);
	}
}
