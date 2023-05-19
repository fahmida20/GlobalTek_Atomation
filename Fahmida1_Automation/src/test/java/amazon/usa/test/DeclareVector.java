package amazon.usa.test;


import java.util.Vector;

public class DeclareVector {

	public static void main(String[] args) {
		Vector<Integer>vec = new Vector<Integer>();
		vec.add(38);
		vec.add(60);
		for (int x: vec) {
			System.out.println(x);      //Advance loop	
		}
		 
	}
}
