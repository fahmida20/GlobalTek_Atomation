package code.ny.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {      // with help of ArrayList remove Duplicate value or find unique value
	public static void main(String[] args) {
		
		List<Integer>remove = new ArrayList<Integer>(Arrays.asList(1,2,3,2,1,5,6));
		    List<Integer> duplicate = remove.stream().distinct().collect(Collectors.toList());
		
		System.out.println(duplicate);
		
		//if they do not mention Arraylist we remove duplicate by set interface
		
		
		
		
	}

}
