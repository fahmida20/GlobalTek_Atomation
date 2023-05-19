package amazon.usa.test;

import java.util.HashMap;
import java.util.Map;


public class DeclareMap {

	public static void main(String[] args) {
		Map<Integer, String> mp = new HashMap<Integer, String>();
		HashMap<Integer, String>mp1 = new HashMap<Integer, String>();
		
		mp.put(1, "Rony");    //we use put method
		mp.put(2, "Rifat"); 
		mp.put(3, null);
		 
		
		System.out.println(mp);
	}
}
