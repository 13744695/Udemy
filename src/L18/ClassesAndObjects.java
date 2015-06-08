package L18;

	class Person{										// this class is not public and so can have any name 
														// not normally done within another class but can be
														// rem classes names are always capitalised
														// Packages generally are not. (Despite what I have here)
														// You can have as many non public classes as you like
	
	// a class is a template/blueprint for creating objects
	// in the real world everything is an object
	// in java classes allow you to specify what the diff objects in the program are like
	// it's a bit like a type like with int, double and String
		
		// classes contain:
		// 1. DATA (Instance Variables 'state')
		// 2. SUBROUTINES (methods - behaviours)
	
		String name;
		int age;
	}
	
	public class ClassesAndObjects {					// if a class is declared public it MUST have the same name as the filename
		public static void main(String [] args){		// YOU CAN ONLY EVER HAVE ONE PUBLIC CLASS IN A FILE
			
			Person p1 = new Person();
			Person p2 = new Person();
			Person p3 = new Person();
			
			p1.name="joe";								// the DOT after the name gives ACCESS to the variables in the Person class.
			p1.age=37;
			p2.name = "Dave";
			p2.age = 45;
			p3.name = "Linda";
			p3.age = 76;
			
		}

	}
	
	
// random note: Java key words are always lower case, ir class, public, static etc
	
// random note:  -note how the bit after new is always the type, int, Scanner, Person
				// note how there's always brackets before the ';' too, albeit a little different with arrays.
	// EXAMPLES:
	// Scanner sc = new Scanner(System.in);
	// Int[][] grid = new Int[][];
	// Person p1 = new Person();
	// Type t1 = new Type();
			