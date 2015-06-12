package L19;
	class Person{										

// methods start with lower case except in the case of constructors
		
		String name;
		int age;
		
		void speak (){		// method
			System.out.println("Hello, My name is: " +name +" I'm " + age +" years old." );
		}
	}
// METHODS ARE BEHAVIOURS

public class MethodsTut {
	
	public static void main(String [] args){
		
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		
		p1.name="joe";								// the DOT after the name gives ACCESS to the variables in the Person class.
		p1.age=37;
		p2.name = "Dave";
		p2.age = 45;
		p3.name = "Linda";
		p3.age = 76;
		
		
		System.out.println(p1.name);
		p1.speak(); 	// CALLING THE METHOD
		p2.speak();
		p3.speak();
		
	}

}
