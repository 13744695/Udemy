package QuizTime;

public class Quiz {
	public static void main(String []args){
		
		System.out.println("CONSTRUCTORS");
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
		System.out.println();
						// non static variables are called instance variables. 
						// static variables also known as class variables belongs to the class. There's only one copy, as there's only one class.
						// So to access desc, you go through the class. Thing.desc = "I am a static class variable of type thing";
						// each object does not get it's own copy. 
		

		
		
	}

}
