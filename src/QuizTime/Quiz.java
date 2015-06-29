package QuizTime;

import java.util.ArrayList;
import java.util.Scanner;

import L27.Machine;
import L29.Info;

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
		System.out.println("Choose from the following question catagory options "
				+ "\n r for random  "
				+ "\n c for constructor  "
				+ "\n s for 'static'  "
				+ "\n f for 'final'  "
				+ "\n x for counting  "
				+ "\n y for String  "
				+ "\n i for inheritance "
				+ "\n z for interfaces "
				+ "\n p for public private protected & encapsulation "
				+ "\n 2 for power of two"
				+ "\n or 'exit'");
		String ans1 = sc.nextLine();
		
		switch (ans1){
		case "r" : random(); break;
		case "c" : construct(); break;
		case "s" : stat(); break;
		case "f" : fin(); break;
		case "x" : count(); break;
		case "y" : StrBuilder(); break;
		case "i" : inher(); break;
		case "z" : interfaces(); break;
		case "p" : ppp(); break;
		case "2" : pow2(); break;
		
		case "exit" : System.out.println("Thank you for taking our quiz, we hope you learned something while you were here. \n Happy Java!!"); break;
		default: openQuiz();						// invalid value: then run the openQuiz method again
		}
		}
	//_________________________________________________________RANDOM_________________________________________________________________________________	
		public static void random(){
		System.out.println("RANDOM CATEGORY QUESTIONS");
		System.out.println();
		System.out.println("What's the shortcut to make the editor full screen in eclipse? ");

		System.out.println("What's the eclipse shortcut for the print statement? ");
		System.out.println("What would you use for an if statement when you want to output 'right' if 'ans' is equal to 'black'");
		System.out.println("Writing up or editing a README.md file in github, how do you get the big bold letters and normal text to work?");
		System.out.println("Of the following, which are started with a capital letter by convention? : \n class \n package \n constructors \n methods");
		System.out.println("What's the eclipse formating shortcut code? ");
		System.out.println("What's the eclipse shortcut to typing the main method? ");
		System.out.println("What's the eclipse shortcut to run the application? ");
		System.out.println("What's the eclipse shortcut to organise imporst?");
		System.out.println("What's the eclipse shortcut for renaming a variable name throughout the code? ");
		System.out.println("How do you rename a class name?");
		System.out.println("What's the eclipse shortcut to remove lines of code?");
		System.out.println("What's the two purposes of packages? ");
		System.out.println("How can you import classes from another package if you need them? ");
		System.out.println("In what way are packages similar to folders?");
		System.out.println("What's the convention for keeping package names unique when sharing programs to prevent conflicts? ");
		System.out.println("What's the eclipse ");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("WHEN READY TO VIEW ANSWERS TYPE \"go\"");
		String go = sc.nextLine();
		
		if (go.equals("go")){		
						System.out.println("     "+"Ctrl M makes the editor fullscreen in eclipse, Ctrl M again to undo.");
						System.out.println( "     "+"sysout and ctrl and space gives - System.out.println();");
						System.out.println("     "+"You can't use == for strings. You must use ans.equals(\"black\")");
						System.out.println("     "+ "You type a hash # before the text to make a heading on a line, leave it out for normal text in README.md via github.com");
						System.out.println("     "+"Class gets a capital letter when named, packages get lower case.");
						System.out.println("     "+"Constructors get a capital letter - BECAUSE IT'S ALWAYS THE SAME NAME AS IT'S CLASS");
						System.out.println("     "+"Methods get a lower case letter");
						System.out.println("     "+"the eclipse formating shortcut code is ctrl shift f ");
						System.out.println("     "+"In eclipse - 'main' ctrl space - will print the main method heading");
						System.out.println("     "+"In eclipse the shortcut to run an application is - ctrl and f11 ");
						System.out.println("     "+"In eclipse the shortcut to organise imports is - ctrl shift and o - it will also remove unwanted imports");
						System.out.println("     "+"In eclipse the shortcut for renaming a variable name throughout the code is - select the name, refactor, rename and retype the name");
						System.out.println("     "+"In eclipse you can do the same thing. select the file, right click, refactor, rename ");
						System.out.println("     "+"In eclipse the shortcut to remove a full line of code, click in the line and crtl d deletes the line without having to select it.");
						System.out.println("     "+"Packages enable you to organise your work in a sensible fashion and \n prevent conflicts between classnames where the classes are of the same name ");
						System.out.println("     "+"In eclipse the shortcut to ");
						System.out.println("     "+"In eclipse the shortcut to ");
						System.out.println("     "+"In eclipse the shortcut to ");
						System.out.println("     "+"To import classes from another package you type import packageName.className; or import packageName.*; \n if you want access to all the classes in that package.");
						System.out.println("     "+"Packages are similar to folders in that you can have packages within java, they are separated by dots");
						System.out.println("     "+"the convention for keeping package names unique when sharing programs to prevent conflicts \n is to name the top package with your web address in reverse. com.webaddress.packageName;");
						
						
						
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
		//__________________________________________________CONSTRUCTORS________________________________________________________________________________________	
		
		public static void construct(){
		System.out.println("CONSTRUCTOR QUESTIONS");
		System.out.println();
		System.out.println("What's special about naming a constructor?  ");
		System.out.println("What are constructors used for? ");
		System.out.println("What happens to a constructor everytime an object is created? ");
		System.out.println("Can a constructor take parameters like a method does? ");
		System.out.println("Can there be different constructors named the same? ");
		System.out.println("What's the layout of a constructor?");
		System.out.println("How can you call a constructor from within another constructor?");
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
						System.out.println("     "+"...for as long as each one takes in different parameters ");
						System.out.println("     "+"...java will figure out which one to call based on the combination of parameters fed into it");
						System.out.println("     "+"Constructors don't have a return type. Typical constructors look like this:     public ClassName()");
						System.out.println("     "+"Constructors can be called from within another constructor, but they must be called as follows");
						System.out.println("     "+"... ' this(if parameters, go in here); '  - the constructor name is not used!! ");
						System.out.println("     "+"... and the other constructor call ' this();  '  must be the first line within the constructor, ");
						System.out.println("     "+"and will be run before the code in the current constructor");
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

		//_____________________________________________STATIC VARIABLES AND METHODS_____________________________________________________________________________________________	
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
						System.out.println("     "+"...So to access desc if it's a static variable, you go through the class. Thing.desc = \"I am a static class variable of type thing\";");
						System.out.println("     "+"...each object does not get it's own copy. You can't call desc via t1.desc = somedesc");
						System.out.println("     "+"Static Methods:");
						System.out.println("     "+"Similar to static variables -");
						System.out.println("     "+"...you call them through the class name - Thingzoid.showInfo();");
						System.out.println("     "+"...whereas non-static methods are called through the object.");
						System.out.println("     "+"Static methods can access static variables");
						System.out.println("     "+"...they can't access instance variables (non-static), they don't deal with the instance variables of the class");
						System.out.println("     "+"...Can't make a static reference to a non-static/instance variable");
						System.out.println("     "+"Static/class variables exist before you even create any objects ");
						System.out.println("     "+"The Static method can't know about non-static variables as they are associated with particular objects");
						System.out.println("     "+"However non-static (Instance) methods CAN access static data. ");
						System.out.println("     "+"By the time you've got objects you've already got a class and static variables are class variables");
						System.out.println();
						System.out.println("     "+"To recap: Given two variables, one which is static and one which is not, ");
						System.out.println("     "+"... the static variable will be accessed through the class, the non static - through the objects.");
						System.out.println("     "+"...non-static are called instance variables - every object get their own copy");
						System.out.println("     "+"...static variables are called class variables - they are associated with the class");
						System.out.println("     "+"...SO.... REM:           STATIC/CLASS and NON-STATIC/INSTANCE");
						System.out.println("     "+"");
						System.out.println("     "+"");
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

		//________________________________________________________THE FINAL KEYWORD__________________________________________________________________________________	
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
						System.out.println("     "+"...and so our own constant variables are also represented here by capitalised name. ");
						System.out.println("     "+"...in other words, the value for PI will never change, so it is capitalised");
						System.out.println("     "+"...and if we want to make 13 a permanent unlucky number never to be changed, it is capitalised too ...UNLUCKY_NUM");
						System.out.println("     "+"The final keyword is to prevent reassigning another constant to the 'variable' UNLUCKY_NUM");
						System.out.println("     "+"When you have a final field you must always set that variable equal to something at the same time as you declare it.");
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

		//___________________________________HOW TO COUNT NUMBER OF OBJECTS ARE THEY ARE CREATED____________________________________________	
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
						System.out.println("     "+"The following would go in the object class - class Thingzoid{}");
						System.out.println("     "+"\"		public static int count = 0;																	\"");
						System.out.println("     "+"NOTE!!!! ...because this is a static variable, we know it belongs to the class and not to each object.");
						System.out.println("     "+"\"		public Thingzoid(){																				\"");
						System.out.println("     "+"\"			count ++;																					\"");
						System.out.println("     "+"\"		}																								\"");
						System.out.println("     "+"this is a CONSTRUCTOR created specifically to count the number of times the class is accessed.");
						System.out.println("     "+"");
						System.out.println("     "+"");
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
	
		//_________________________________________________STRING BUILDER__________________________________________________________________________________________
		
		public static void StrBuilder() {
			
			System.out.println("STRING BUILDER/FORMATTING RELATED QUESTIONS");
			System.out.println();
			System.out.println("Why bother with StringBuilder? How does it work? ");
			System.out.println("Give an example of where you would use %d in a print statement");
			System.out.println("How do you initiate a new line within a print statement? ");
			System.out.println("%d is known as a what? What does it do?");
			System.out.println("%s, what does it do? ");
			System.out.println("%f, what does it do? ");
			System.out.println("%s, what happens if you put .6 between the % and the f?");
			System.out.println("%s, what happens if you put 25.6 between the % and the f?");
			System.out.println("%s, what happens if you put -25.6 between the % and the f?");
			
			System.out.println("What do the following escape characters do following a backslash? \n b, t, n, f, r ");
			System.out.println("What happens if you use %10d or %-10d? ");
			System.out.println();
			System.out.println();
			System.out.println();
			
			Scanner sc = new Scanner(System.in);
			System.out.println("WHEN READY TO VIEW ANSWERS TYPE \"go\"");
			String go = sc.nextLine();
			
			if (go.equals("go")){
			
			System.out.println("     "+"StringBuilder is more efficient than say, using -");
			System.out.println("     "+"...	String info = \"\";		");
			System.out.println("     "+"...	info += \"My name is Bob\";				// everytime you do this you're creating a brand new string. 		");
			System.out.println("     "+"...	info += \" \";		");
			System.out.println("     "+"...	info += \"I am a builder.\";\");		");
			System.out.println();
			System.out.println("     "+"StringBuilder sb = new StringBuilder();  ");
			System.out.println("     "+"...	and use sb.append() to put info into a String");
			System.out.println("     "+"...	print out using     ");
			System.out.println("     "+"...	System.out.println(sb.toString());");
			System.out.println();
			System.out.println("     "+"System.out.printf(\"total cost %d; Quantity %d\", 5 , 120);");
			System.out.println("     "+"...	The f is for format, there is no ln used in this type of print statement so you will usually have to use '\n' ");
			System.out.println("     "+"...	In these statements, the '%d' are replaced with the values outside the \"\"'s. ");
			System.out.println("     "+"...	Note the internal bits are separated by the semi colon, then the external bits are separated by commas");
			System.out.println("     "+"...	Pay particular attention to the first comma after the closing \" quote");
			System.out.println("  \\b = backspace \n  \\t = tab  \n  \\n   = new line \n  \\f  =  formfeed  \n  \\r  =  carriage return ");
			
			System.out.println("     "+"");
			System.out.println("     "+"%d is known as a fomatting character and it takes the next argument and formats it as an int");
			System.out.println("     "+"%s is known as a fomatting character and it takes the next argument and formats it as an String");
			System.out.println("     "+"%f is known as a fomatting character and it takes the next argument and formats it as an floating point");
			System.out.println("     "+"putting a 10 or a minus 10 between the % and the d, \n ... will allocate 10 spaces for the int and push the int to the right or after in the case of minus to the left");
			System.out.println("     "+" given %.6f -the .6 tells the floating point how many decimals are to be printed");
			System.out.println("     "+" given %25.6f -the 25 (before the .6 tells the floating point it can take up 25 spaces, \n ...and is to be justified to the right of those 25 spaces");
			System.out.println("     "+" given %-25.6f -the -25 (before the .6 tells the floating point it can take up 25 spaces, \n ...and is to be justified to the left of those 25 spaces");
			System.out.println("     "+"");
			System.out.println("     "+"");
			
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
		
		//___________________________________________________INHERITANCE________________________________________________________________________________________
		
				public static void inher() {
					
					System.out.println("How do you show inheritance from one class to the other, which is child class?");
					System.out.println("How do you keep a variable for use only within its own class?");
					System.out.println("How do you allow the variable to be accessed from anywhere?");	
					System.out.println("How do you allow it to be accessed only from within the package?");
					System.out.println();
					System.out.println();
					
					Scanner sc = new Scanner(System.in);
					System.out.println("WHEN READY TO VIEW ANSWERS TYPE \"go\"");
					String go = sc.nextLine();
					
					if (go.equals("go")){
					
						System.out.println("     "+"public class Car extends Machine - is an example of where a Car class inherits from a Machine class, \n            the car class is the child class");
						System.out.println("     "+"you keep a variable for use only within its own class by making it private");
						System.out.println("     "+"you allow the variable to be accessed from anywhere, by not having any keyword");
						System.out.println("     "+"you allow it to be accessed only from within the package, by making it protected");
						System.out.println("     "+"");
						System.out.println("     "+"");
						
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
	
				//_____________________________________________________INTERFACES______________________________________________________________________________________
				
				public static void interfaces() {
					
					System.out.println("What are interfaces used for in java? ");
					System.out.println("What are methods like in the interface class? ");
					System.out.println("How do you tell an object class that it is to be associated with an interface?");	
					System.out.println("How do you tell an object what methods to bring in from the interface? ");
					System.out.println("Can more than one interface be implemented in an object class? If yes, how?");
					System.out.println("Can more than one extends be used in an object class? If yes, how?");
					System.out.println("Can you add more methods to the interface class after the object class has been hooked up to it?");
					System.out.println("Naming conventions for the interface class?");
					System.out.println();
					
					Scanner sc = new Scanner(System.in);
					System.out.println("WHEN READY TO VIEW ANSWERS TYPE \"go\"");
					String go = sc.nextLine();
					
					if (go.equals("go")){
					
						System.out.println("     "+"These answers may not be 100% correct, they are my interpretation on the topic of interfaces");
						System.out.println("     "+"");
						System.out.println("     "+"Interfaces can be used when you want to make sure an object class is using a specific set of methods as declared in the interface");
						System.out.println("     "+"If you are designing a program that will have several vehicle objects for example, the car class and truck class etc");
						System.out.println("     "+"... might all have similar methods that are useful to have. ");
						System.out.println("     "+"... These methods could be grouped into an info interface (as a catagory) ");
						System.out.println("     "+"... then you can set up an object via the interface which would only have access to the methods associated with the interface");
						System.out.println("     "+"Example of calling an interface object:  Info info1 = new Machine();");
						System.out.println("     "+"... Where Info is the name of the interface class. ");
						System.out.println("     "+"... The Info name can be substituted in anywhere the object class name is usually used... EXCEPT...");
						System.out.println("     "+"... after the 'new' keyword. ");
						System.out.println("     "+"Methods in the interface are essentially just a list of method headers. \n ... They have no body or no content in the interface class");
						System.out.println("     "+"The object class is associated with the interface by using the implements keyword. \n eg public class Machine implements Info {  ");
						System.out.println("     "+"The methods are typed up within whichever class they are associated with via this implementation");
						System.out.println("     "+"On typing in the keyword implements, eclipse will ask to add unimplemented methods. ");
						System.out.println("     "+"... thus forcing you to ensure each method in the interface is used in that object class");
						System.out.println("     "+"a class can implement any number of interfaces. they would be separated by commas");
						System.out.println("     "+"a class can only extend one parent class though");
						System.out.println("     "+"As you add more methods to the interface class, \n ...eclipse will ask you to add unimplemented methods for each related object class");
						System.out.println("     "+"interfaces are named with a capital letter as are classes. \n ...I good idea might be to start each implement class name with an I to help identify it as an interface");
						System.out.println("     "+"In some cases interfaces are created in the design phase as a person considers what methods will be needed commonly across classes.");
						System.out.println("     "+"");
						System.out.println("     "+"");
						System.out.println("     "+"");
						System.out.println("     "+"");						
						
						
						
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
				//_____________________________________________________PUBLIC PRIVATE PROTECTED______________________________________________________________________________________
				
				public static void ppp() {
					
					System.out.println("Give a summary of what is meant by public, private and protected");
					System.out.println("What policy should you try to follow in deciding on whether a variable is public private or protected");
					System.out.println("So what is encapsulation about then?");	
					System.out.println("When might you declare a public variable?");
					System.out.println("How can you let users access private variables? ");
					System.out.println();
					
					Scanner sc = new Scanner(System.in);
					System.out.println("WHEN READY TO VIEW ANSWERS TYPE \"go\"");
					String go = sc.nextLine();
					
					if (go.equals("go")){
					
						System.out.println("     "+"SUMMARY \n -private accessed only within same class \n public accessed from anywhere \n protected accessed from the subclass and same package\n no modifier accessed from the same package only");
						System.out.println("     "+"You always try to make variables private if you can.  \n getters and setters are used to let people access this variable.");
						System.out.println("     "+"Objective is to make as much as possible private within a program. \n It prevents cross contamination between classes You just want to have a few methods defined public ");
						System.out.println("     "+"The idea of encapsulation is you encapsulate the inner workings of that class - within that class. \n - you stop people outside the class getting at the guts of that class\n you expose certain methods for people to use outside that class.");
						System.out.println("     "+"You can declare public variables but that would usually be when variables are both final and static. \n final means the value can never be changed \n static meaning it's a class variable.");
						System.out.println("     "+"Getters and setters are used to let people access this variable.\n note: SOURCE - GENERATE GETTERS AND SETTERS - will auto generate the getter and setter methods for you \n note: if a variable is final, then eclipse knows that there's no use for a setter method and won't auto generate one");
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
			
				//_____________________________________________________Powers of two______________________________________________________________________________________
				
				public static void pow2() {
					
					// plan to build an array of questions, so that they can be accessed randomly
					
					System.out.println("Please write down the questions and solutions to each of the following and compare with answer sheet when complete");
					System.out.println("It is said that these power of 2's need to be committed to memory, esp prior to interviews");
					System.out.println();
					
					ArrayList<String> l1 = new ArrayList();
					
					l1.add("What is 7 to the power of 2?");
					l1.add("What is 8 to the power of 2?");
					l1.add("What is 10 to the power of 2?");
					l1.add("What is 16 to the power of 2?");
					l1.add("What is 20 to the power of 2?");
					l1.add("What is 30 to the power of 2?");
					l1.add("What is 32 to the power of 2?");
					l1.add("What is 40 to the power of 2?");
					
					for(String value : l1){
					System.out.println(value);
					}
					
					Scanner sc = new Scanner(System.in);
					System.out.println("WHEN READY TO VIEW ANSWERS TYPE \"go\"");
					String go = sc.nextLine();
					
					if (go.equals("go")){
					
						System.out.println("     "+"The following numbers to the power of two are:");
						System.out.println();
						System.out.printf("     "+"Power of 2: %5d ;    Exact Value: %20s ;    Approx: %12s ;    bytes: %6s \n",  7, "128","","" );
						System.out.printf("     "+"Power of 2: %5d ;    Exact Value: %20s ;    Approx: %12s ;    bytes: %6s \n", 8, "256","","");
						System.out.printf("     "+"Power of 2: %5d ;    Exact Value: %20s ;    Approx: %12s ;    bytes: %6s \n",10,"1,024","1 Thousand","1 k");
						System.out.printf("     "+"Power of 2: %5d ;    Exact Value: %20s ;    Approx: %12s ;    bytes: %6s \n",16,"65,536","     ","64 k");
						System.out.printf("     "+"Power of 2: %5d ;    Exact Value: %20s ;    Approx: %12s ;    bytes: %6s \n",20,"1,048,576","1 Million","1 mb");
						System.out.printf("     "+"Power of 2: %5d ;    Exact Value: %20s ;    Approx: %12s ;    bytes: %6s \n",30,"1,073.741,824","1 Billion","1 gb");
						System.out.printf("     "+"Power of 2: %5d ;    Exact Value: %20s ;    Approx: %12s ;    bytes: %6s \n",32,"4,294,967,296","4.2 Billion","4 gb");
						System.out.printf("     "+"Power of 2: %5d ;    Exact Value: %20s ;    Approx: %12s ;    bytes: %6s \n",40,"1,099,511,627,776","1 Trillion","1 tb");
						System.out.println("     "+"");
						System.out.println("     "+"");
						System.out.println("     "+"");
						
						
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
				//_____________________________________________________SPARE TEMPLATE FOR OTHER CATEGORIES______________________________________________________________________________________
				
				public static void spare() {
					
					System.out.println();
					System.out.println();
					System.out.println();	
					System.out.println();
					System.out.println();
					System.out.println();
					
					Scanner sc = new Scanner(System.in);
					System.out.println("WHEN READY TO VIEW ANSWERS TYPE \"go\"");
					String go = sc.nextLine();
					
					if (go.equals("go")){
					
						System.out.println("     "+"");
						System.out.println("     "+"");
						System.out.println("     "+"");
						System.out.println("     "+"");
						System.out.println("     "+"");
						System.out.println("     "+"");
						
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
				//_______________________________________________________End of Template_____________________________________________________________________________________________
				}
		


