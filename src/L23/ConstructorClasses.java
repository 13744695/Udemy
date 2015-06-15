package L23;


//_______________________________________Main Application Class__________________________________________________

	// Constructors are often used to initialise instance variables
	// Constructor run every time an object is created.
	// Constructors can take parameters in the same way a method can
	// As with methods, you can have several different constructors with the very same name
	// for as long as each one takes in different parameters 
	// java will figure out which one to call based on the combination of parameters fed into it


public class ConstructorClasses {
	public static void main(String [] args){
		
		
		Machine m1 = new Machine();
		new Machine(); 				// does same thing as the constructor call in the object creation above it
		
		Machine m2 = new Machine("Alma");
		
		
		Machine m3 = new Machine("Jerry",12);
		
	}

}


//__________________________________________-Class_________________________________________________________________

class Machine{
	private String name;
	
	public Machine() {            	// no return type in a constructor
	
	System.out.println("Constructor is running");	
		
		name = "Arnie";				// constructor is run every time an object is created, so all machine objects will now
									// have the default name "Arnie"
	}
	public Machine(String name){
		this();						// This is how you can call one of the other constructors within this constructor. 
									// Note you use the word 'this' rather than 'Machine'
									// You can put parameters to choose another constructor
									// The constructor call must be the first line of code within the constructor.
	
		System.out.println("2nd constructor is running now ");
		
		this.name = name;
		

	}
	
	public Machine (String name, int code){
		System.out.println("3rd constructor is now running");
		this.name = name;
	}
}
