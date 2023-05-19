package code.ny.practice;

public class SplitWord {
	public static void main(String[] args) {
		String word = "United States of America";
		String[]wd = word.split(" ");    // we write word.split than store it String[] wd/ Array object
		for(String key: wd){
			
			System.out.println(key);
		}
	}
	

}
