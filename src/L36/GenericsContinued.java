package L36;

import java.util.ArrayList;

public class GenericsContinued {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("one");
		list.add("two");
		showList(list);
		
	}
	//______________Methods below_________________
	
	public static void showList(ArrayList<String> list) {						// static because we don't have an object of the class GenericsContinued
														// so to call this method without doing 'new' path it's going to have to be static
		for(String value: list) {
			System.out.println(value);
		}
		
		
	}

}

//_______________________________external classes below________________________
class Machine{												// a class with no extends always implicitly extends the Object class.
	
	
}

class Camera extends Machine {
	
	
}