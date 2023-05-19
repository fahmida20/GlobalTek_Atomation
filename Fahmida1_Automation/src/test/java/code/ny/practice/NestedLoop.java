package code.ny.practice;

public class NestedLoop {
	public static void duplicate (){
		String[]names = {"Java", "Mavan","Python","C+","Java"};
		for(int i=0; i<names.length; i++) {
			for (int j=i+1; j<names.length; j++) {
				if (names[i].equals(names[j])) {
					System.out.println(names[i]);	
				}
				
			}
		}
	}
	public static void main(String[] args) {
		NestedLoop.duplicate();
	}

}
