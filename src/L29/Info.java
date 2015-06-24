package L29;

public interface Info {
	public void showInfo(); 								// this is a method, but it's different to a class method.
															// you can have several methods in an interface. Once you extend a class to the interface, 
															// then it is expected that you must reference each of the methods mentioned in the interface in the class
	
															// interface methods don't have any code in paraenthesis  
															// they only have the header of a method
	
															// in one or more of the classes you can change the class to implement Info (The name of this interface)
															// example of code is -  public class Machine implements Info {   ...    }
															// a class can implement any number of interfaces. they would be separated by commas
															// a class can only extend one parent class though.
	
															// benefits of interface is:
															// you can use them anywhere you would normally use the class name
															// the only place you can't use an interface is when make a "new" object after the word new
															// new generally needs to be followed by a class name (there are some exceptions)
															// so... instead of typing        	Machine m2 = new Machine();
															// ... you could type 				Info info1 = new Machine();
															// This is a variable of type Info, named info1, pointing to an object of type machine
															// This variable can only be used to access just the methods that are defined in the interface named Info.
															// When you add new methods to the interface the classed that extend the interfaces throw up errors 
															// and ask that you implement the methods - further errors will be thrown until you save the interface file too.
															//
															// TIP IT MIGHT BE AN IDEA TO NAME INTERFACES STARTING WITH THE LETTER I. 
															// ... SO IInfo.java might have been a better name to help identify that it's an interface 
															// 
															// In designing a program, you might decide before you start that objects will have a start and stop method etc
															// These can be put into the interface first at the design stage.
															// 
															//
	
															
	public void testing();
	
}
