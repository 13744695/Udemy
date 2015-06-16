package L24;

//_________________________________________Main Class______________________________________________________
public class StaticMethods {
	public static void main (String args[]){
		
		Thingzoid.desc = "I am a Thingzoid";		// this needs to be placed up top before the showName method is called, or the result will be null for desc in the SOP.
		
		System.out.println("Before I create a Thingzoid object count is: " +Thingzoid.count);
		Thingzoid t1 = new Thingzoid();
		Thingzoid t2 = new Thingzoid();
		System.out.println("After I create some Thingzoid objects, count is: " +Thingzoid.count);
		t1.name = "Bob";
		t2.name = "Sue";

			
		t1.showName();
		t2.showName();

		

		System.out.println(Thingzoid.desc + " This one is called directly from the main method in the main class");
		
		Thingzoid.showInfo();
		System.out.println(Math.PI);							// Math is an example of a static class available from the java libraries
		System.out.println("Thingzoid.UNLUCKY_NUMBER :    " +Thingzoid.UNLUCKY_NUMBER);			
																// Constant variables such as PI are represented in java by capital letters. 
																// and so our own constant variable is also represented here by capitalised name. 
																// see the declaration in the Thingzoid class
		System.out.println("After I accessed the Thingzoid class a few times the count is still the same as the number of objects created, count is: " +Thingzoid.count);
		System.out.println("The count feature only counts when objects have been created. ");
		//_________________________________________________________________________________________________
		System.out.println();
		System.out.println();
		System.out.println("Quiz time");
		System.out.println("How can you call a non static method? :");
		System.out.println("How can you call a static method? :");
		System.out.println("Can static methods access static variables? :");
		System.out.println("Can static methods access non-static variables? :");
		System.out.println("When do static instance variables exist? Before or after you create objects? :");
		System.out.println("When do non-static class variables exist? Before or after you create objects? :");
		System.out.println("What are non-static class variables associated with? :");
		System.out.println("Why or how would you use the 'final' field? :");
		System.out.println("What are the naming conventions in relation to using a final field? :");
		System.out.println("What are the rules in relation to assigning a value when using a final field? :");
		System.out.println("What are needed to ");
		System.out.println();
		System.out.println();
	}
}

//_______________________________________Thingzoid Class____________________________________________________

class Thingzoid{
	
	public String name;
	public static String desc;
	public final static int UNLUCKY_NUMBER= 13;					// Constant variables such as PI are represented in java by capital letters. 
																// and so our own constant variable is also represented here by capitalised name. 
																// The final here is to prevent reassigning another constant to the 'variable' UNLuCKY_NUMBER
																// When you have a final field you must always set that variable equal to something when you declare it.
	
	
	public static int count = 0;								// because this is a static variable, we know it belongs to the class and not to each object.
	
	public Thingzoid(){											// this is a constructor created specifically to count the number of times the class is accessed.
		count ++;
		
	}
	
	public void showName(){
		System.out.println("name: "+name);
		System.out.println(desc +" called " + name);
	}
	public static void showInfo(){
		System.out.println("The static method 'showInfo' has been called.");
	}
	
}

// Static Methods:
// Similar to static variables -
// You call them through the class name - Thingzoid.showInfo();
// Whereas non-static methods are called through the object.
// Static methods can access static variables
// they can't access instance variables (non-static)
// Can't make a static reference to a non-static field name
// Static instance variables exist before you even create any objects 
// The Static method can't know about non-static variables as they are associated with particular objects
// However non-static (Instance) methods can access static data. 
// By the time you've got objects you've got a class
// Uses for static methods 
// - if you've got a method that takes in arguments, outputs a result, but never deals with the instance variables
// - if you wish to make a variable a constant. UNLUCKY_NUMBER in the case of the example above will always be 13
// - if you want to count the number of objects you are creating.
//
//