package QuizTime;

import java.util.Scanner;

/*
 * Given the fact I've been revising Java from scratch to help cement detail the following quiz has evolved:
 * 
 * A quiz designed to offer a few test questions on Java programming
 * 
 * The quiz is opened using an openQuiz method which runs automatically, or when an invalid selection is typed
 * User is offered a selection of topics to be quizzed on
 * On choosing a topic the user is presented with a number of questions on that topic and...
 * an option to type go when they've had time to think about the answers to see the solutions
 * 
 * 
 */

public class Quiz {
	public static void main(String []args){
		System.out.println("Welcome to your Java Quiz. Good luck!!");
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		openQuiz();
		
	}
	

		public static void openQuiz() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose from the following options \n r for random category questions \n c for constructor type questions \n s for 'static' type questions \n f for 'final' related questions \n x for counting questions \n or 'exit'");
		String ans1 = sc.nextLine();
		
		switch (ans1){
		case "r" : random(); break;
		case "c" : construct(); break;
		case "s" : stat(); break;
		case "f" : fin(); break;
		case "x" : count(); break;
		case "exit" : System.out.println("Thank you for taking our quiz, we hope you learned something while you were here. \n Happy Java!!"); break;
		default: openQuiz();						// invalid value: then run the openQuiz method again
		}
		}
	//__________________________________________________________________________________________________________________________________________	
		public static void random(){
		System.out.println("RANDOM CATEGORY QUESTIONS");
		System.out.println();
		System.out.println("What's the shortcut to make the editor full screen in eclipse? ");

		System.out.println("What's the eclipse shortcut for the print statement? ");
		System.out.println("What would you use for an if statement when you want to output 'right' if 'ans' is equal to 'black'");
		System.out.println();
		System.out.println();
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("WHEN READY TO VIEW ANSWERS TYPE \"go\"");
		String go = sc.nextLine();
		
		if (go.equals("go")){		
						System.out.println("     "+"Ctrl M makes the editor fullscreen in eclipse, Ctrl M again to undo.");
						System.out.println( "     "+"sysout and ctrl and space gives - System.out.println();");
						System.out.println("     "+"You can't use == for strings. You must use ans.equals(\"black\")");
						System.out.println();
						System.out.println();
						System.out.println();
						
						Scanner sc1 = new Scanner(System.in);
						System.out.println("WHEN READY TO GO BACK TO CHOICES TYPE \"go\" OR \"exit\" to exit");
						String go1 = sc.nextLine();	
						 if (go1.equalsIgnoreCase("go")){
							 openQuiz();
						 }
						 else if(go1.equalsIgnoreCase("exit")){
							System.out.println("Thank you for taking our quiz, we hope you learned something while you were here. \n Happy Java!!");
						 }
		}
		
		}
		//__________________________________________________________________________________________________________________________________________	
		
		public static void construct(){
		System.out.println("CONSTRUCTOR QUESTIONS");
		System.out.println();
		System.out.println("What's special about naming a constructor?  ");
		System.out.println("What are constructors used for? ");
		System.out.println("What happens to a constructor everytime an object is created? ");
		System.out.println("Can a constructor take parameters like a method does? ");
		System.out.println("Can there be different constructors named the same? ");
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("WHEN READY TO VIEW ANSWERS TYPE \"go\"");
		String go = sc.nextLine();
		
		if (go.equals("go")){		
						System.out.println("     "+"Constructors must have the same name as the class.");
						System.out.println("     "+"Constructors are often used to initialise instance variables");
						System.out.println("     "+"Constructor run every time an object is created.");
						System.out.println("     "+"Constructors can take parameters in the same way a method can");
						System.out.println("     "+"As with methods, you can have several different constructors with the very same name");
						System.out.println("     "+"for as long as each one takes in different parameters ");
						System.out.println("     "+"java will figure out which one to call based on the combination of parameters fed into it");
						System.out.println();
						System.out.println();
						System.out.println();
						
						Scanner sc1 = new Scanner(System.in);
						System.out.println("WHEN READY TO GO BACK TO CHOICES TYPE \"go\" OR \"exit\" to exit");
						String go1 = sc.nextLine();	
						 if (go1.equalsIgnoreCase("go")){
							 openQuiz();
						 }
						 else if(go1.equalsIgnoreCase("exit")){
							System.out.println("Thank you for taking our quiz, we hope you learned something while you were here. \n Happy Java!!");
						 }
		}
		
		}

		//__________________________________________________________________________________________________________________________________________	
		public static void stat(){
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
		System.out.println();
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("WHEN READY TO VIEW ANSWERS TYPE \"go\"");
		String go = sc.nextLine();
		
		if (go.equals("go")){		
						System.out.println("     "+"non static variables are called instance variables. ");
						System.out.println("     "+"static variables also known as class variables belongs to the class. There's only one copy, as there's only one class.");
						System.out.println("     "+"So to access desc, you go through the class. Thing.desc = \"I am a static class variable of type thing\";");
						System.out.println("     "+"each object does not get it's own copy. ");
						System.out.println("     "+"Static Methods:");
						System.out.println("     "+"Similar to static variables -");
						System.out.println("     "+"You call them through the class name - Thingzoid.showInfo();");
						System.out.println("     "+"Whereas non-static methods are called through the object.");
						System.out.println("     "+"Static methods can access static variables");
						System.out.println("     "+"they can't access instance variables (non-static)");
						System.out.println("     "+"Can't make a static reference to a non-static field name");
						System.out.println("     "+"Static instance variables exist before you even create any objects ");
						System.out.println("     "+"The Static method can't know about non-static variables as they are associated with particular objects");
						System.out.println("     "+"However non-static (Instance) methods can access static data. ");
						System.out.println("     "+"By the time you've got objects you've got a class");
						System.out.println("     "+"");
						
						System.out.println();
						System.out.println();
						System.out.println();
						
						Scanner sc1 = new Scanner(System.in);
						System.out.println("WHEN READY TO GO BACK TO CHOICES TYPE \"go\" OR \"exit\" to exit");
						String go1 = sc.nextLine();	
						 if (go1.equalsIgnoreCase("go")){
							 openQuiz();
						 }
						 else if(go1.equalsIgnoreCase("exit")){
							System.out.println("Thank you for taking our quiz, we hope you learned something while you were here. \n Happy Java!!");
						 }
		}
		
		}

		//__________________________________________________________________________________________________________________________________________	
		public static void fin() {
		
		System.out.println("Some 'final' questions");
		System.out.println();
		System.out.println("Why or how would you use the 'final' field? :");
		System.out.println("What are the naming conventions in relation to using a final field? :");
		System.out.println("What are the rules in relation to assigning a value when using a final field? :");

		System.out.println();
		System.out.println();
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("WHEN READY TO VIEW ANSWERS TYPE \"go\"");
		String go = sc.nextLine();
		
		if (go.equals("go")){		
						System.out.println("     "+"\"     public final static int UNLUCKY_NUMBER= 13;		\"");
						System.out.println("     "+"Constant variables such as PI are represented in java by capital letters.");
						System.out.println("     "+"and so our own constant variable is also represented here by capitalised name. ");
						System.out.println("     "+"The final here is to prevent reassigning another constant to the 'variable' UNLuCKY_NUMBER");
						System.out.println("     "+"When you have a final field you must always set that variable equal to something when you declare it.");
						System.out.println("     "+"\"     System.out.println(Math.PI);	 \"");
						System.out.println("     "+"Math.PI is an example of a static class available from the java libraries, note it is also capitalised");
						System.out.println();
						System.out.println();
						System.out.println();
						
						Scanner sc1 = new Scanner(System.in);
						System.out.println("WHEN READY TO GO BACK TO CHOICES TYPE \"go\" OR \"exit\" to exit");
						String go1 = sc.nextLine();	
						 if (go1.equalsIgnoreCase("go")){
							 openQuiz();
						 }
						 else if(go1.equalsIgnoreCase("exit")){
							System.out.println("Thank you for taking our quiz, we hope you learned something while you were here. \n Happy Java!!");
						 }
		}
		
		
		}

		//__________________________________________________________________________________________________________________________________________	
		public static void count() {
		System.out.println("Some counting questions");
		System.out.println();
		System.out.println("What's needed to count number of objects created in the MAIN class? :");
		System.out.println("What's needed to count number of objects created in the object class? :");

		System.out.println();
		System.out.println();
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("WHEN READY TO VIEW ANSWERS TYPE \"go\"");
		String go = sc.nextLine();
		
		if (go.equals("go")){		
						System.out.println("     "+"The following would go in the main class");
						System.out.println("     "+"\"		System.out.println(\"Before I create a Thingzoid object count is: \" +Thingzoid.count);			\"");
						System.out.println("     "+"\"		Thingzoid t1 = new Thingzoid();																	\"");
						System.out.println("     "+"\"		Thingzoid t2 = new Thingzoid();																	\"");
						System.out.println("     "+"\"		System.out.println(\"After I create some Thingzoid objects, count is: \" +Thingzoid.count);		\"");
						System.out.println("     "+"");
						System.out.println("     "+"The following would go in the object class");
						System.out.println("     "+"\"		public static int count = 0;																	\"");
						System.out.println("     "+"because this is a static variable, we know it belongs to the class and not to each object.");
						System.out.println("     "+"\"		public Thingzoid(){																				\"");
						System.out.println("     "+"\"			count ++;																					\"");
						System.out.println("     "+"\"		}																								\"");
						System.out.println("     "+"this is a CONSTRUCTOR created specifically to count the number of times the class is accessed.");
						System.out.println("     "+"");
						System.out.println();
						System.out.println();
						System.out.println();
						
						Scanner sc1 = new Scanner(System.in);
						System.out.println("WHEN READY TO GO BACK TO CHOICES TYPE \"go\" OR \"exit\" to exit");
						String go1 = sc.nextLine();	
						 if (go1.equalsIgnoreCase("go")){
							 openQuiz();
						 }
						 else if(go1.equalsIgnoreCase("exit")){
							System.out.println("Thank you for taking our quiz, we hope you learned something while you were here. \n Happy Java!!");
						 }
		}
		
		
		}
	

}
