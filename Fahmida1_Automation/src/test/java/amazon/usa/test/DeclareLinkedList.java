package amazon.usa.test;

import java.util.LinkedList;

public class DeclareLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer>list = new LinkedList<Integer>();
		list.add(100);
		list.add(70);
		for (int i=0; i<list.size(); i++) { 
			System.out.println(list.get(i));
		}
		
	}

}
