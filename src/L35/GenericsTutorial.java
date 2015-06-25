package L35;

import java.util.ArrayList;
import java.util.HashMap;

public class GenericsTutorial {
	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		l1.add("APPLE");
		l1.add("Banana");
		l1.add("Orange");
		
		// the following is the old way to do things
		String f0 = (String) l1.get(0);			// downcasting an object to String
		String f1 = (String) l1.get(1);
		String f2 = (String) l1.get(2);
		
		
		
		
		
		// new way of doing things using generics
		
		ArrayList<String> Str = new ArrayList<String>();
									// and array list is a parameterised class - a generic class
									// with generic classes you need to specify the type inside the diamond brackets after the base type name.
									// as this one is to be an array of Strings, we called it Str
									// Str.add
		Str.add("cat");
		Str.add("Dog");
		Str.add("Alligator");
		
		String animal = Str.get(0);		// you no longer need to cast the type to String here because is it handled in the generics above.
		System.out.println(animal);

		
		// you can have parameterised classes that have more than one type of argument
		
		HashMap<Integer, String> mp1 = new HashMap<Integer, String>();  // HashMaps permit you to declare two types for one arraylist
		
		
		ArrayList<Integer> AL2 = new ArrayList<>();
		ArrayList<Animal> AL3	= new ArrayList<>();				// this shows that you can you your own object 'animal' in this case
																	// and that in recent versions of java you no longer need to fill in the second set of diamond brackets with type.
		
		
		
		
		
		
	}

}

class Animal {
	
}