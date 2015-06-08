package L8;

public class Application {
	public static void main(String []args){
		int myInt = 7;				// int is the type, myInt is the name , and 7 is the value assigned to the int called myInt
		String myString = "Hello";  // a string is a class which means it's a type of object that can hold text.
		String blank = " ";
		String name = "Bob";
		String greeting = myString + blank + name;
		double myDouble = 7.8;		// double precision floating point number
		
		
		System.out.println(greeting);
		System.out.println(myString +" " + name);
		System.out.println("My integer is " +myInt);
		System.out.println("My num is "+myDouble +".");
		
	}

}
