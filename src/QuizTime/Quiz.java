package QuizTime;



public class Quiz {
	public static void main(String []args){
		
		System.out.println("RANDOM CATEGORY QUESTIONS");
		System.out.println();
		System.out.println("How do you make the editor full screen in eclipse? :");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
						// Ctrl M makes the editor fullscreen in eclipse, Ctrl M again to undo.
		
		
		System.out.println("CONSTRUCTOR QUESTIONS");
		System.out.println();
		System.out.println("What's special about naming a constructor? : ");
		System.out.println("What are constructors used for? : ");
		System.out.println("What happens to a constructor everytime an object is created? :");
		System.out.println("Can a constructor take parameters like a method does? :");
		System.out.println("Can there be different constructors named the same? :");
		System.out.println();
		System.out.println();
						// Constructors must have the same name as the class.
						// Constructors are often used to initialise instance variables
						// Constructor run every time an object is created.
						// Constructors can take parameters in the same way a method can
						// As with methods, you can have several different constructors with the very same name
						// for as long as each one takes in different parameters 
						// java will figure out which one to call based on the combination of parameters fed into it

		
		
		System.out.println("STATIC KEYWORD QUESTIONS");
		System.out.println();
		System.out.println("Non Static variables are called? : ");
		System.out.println("Static variables are also known as? :");
		System.out.println("How many copies can there be of static variables? :");
		System.out.println("How many copies can there be of non-static variables? :");
		System.out.println("Each object does not get it's own copy of which type of variable? Static or Non-Static? :");
		System.out.println("How do you access a static variable? : ");
		System.out.println("How can you call a static method? :");
		System.out.println("Can static methods access static variables? :");
		System.out.println("Can static methods access non-static variables? :");
		System.out.println("When do static instance variables exist? Before or after you create objects? :");
		System.out.println("When do non-static class variables exist? Before or after you create objects? :");
		System.out.println("What are non-static class variables associated with? :");
		System.out.println();
						// non static variables are called instance variables. 
						// static variables also known as class variables belongs to the class. There's only one copy, as there's only one class.
						// So to access desc, you go through the class. Thing.desc = "I am a static class variable of type thing";
						// each object does not get it's own copy. 
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
		System.out.println("Some 'final' questions");
		System.out.println();
		System.out.println("Why or how would you use the 'final' field? :");
		System.out.println("What are the naming conventions in relation to using a final field? :");
		System.out.println("What are the rules in relation to assigning a value when using a final field? :");
		System.out.println();
						// "     public final static int UNLUCKY_NUMBER= 13;		"			
						// Constant variables such as PI are represented in java by capital letters. 
						// and so our own constant variable is also represented here by capitalised name. 
						// The final here is to prevent reassigning another constant to the 'variable' UNLuCKY_NUMBER
						// When you have a final field you must always set that variable equal to something when you declare it.
						// "     System.out.println(Math.PI);	 "						
						// Math.PI is an example of a static class available from the java libraries, note it is also capitalised
		System.out.println("Some counting questions");
		System.out.println();
		System.out.println("What's needed to count number of objects created in the MAIN class? :");
		System.out.println("What's needed to count number of objects created in the object class? :");
		System.out.println();

						// The following would go in the main class
						// "		System.out.println("Before I create a Thingzoid object count is: " +Thingzoid.count);			"
						// "		Thingzoid t1 = new Thingzoid();																	"
						// "		Thingzoid t2 = new Thingzoid();																	"
						// "		System.out.println("After I create some Thingzoid objects, count is: " +Thingzoid.count);		"
						// The following would go in the object class
						// "		public static int count = 0;																	"
						// because this is a static variable, we know it belongs to the class and not to each object.
						// "		public Thingzoid(){																				"
						// "			count ++;																					"
						// "		}																								"
						// this is a CONSTRUCTOR created specifically to count the number of times the class is accessed.
		
		
	}

}
