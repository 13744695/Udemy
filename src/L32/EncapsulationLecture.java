package L32;

public class EncapsulationLecture {
	public static void main(String[] args) {
		
		Plant p1 = new Plant();
	System.out.println(p1.id);	
	// System.out.println(p1.name);				// this won't work because name is a private variable in the Plant class
	p1.setName("bobby");						// you need to set the name first using the setter method, then you can call the getter method to print the value you gave to name.
	System.out.println(p1.getName());
	System.out.println(p1.getRef());
	System.out.println(p1.getData());
	}
}
/*
* the idea of encapsulation is you encapsulate the inner workings of that class - within that class.
* - you stop people outside the class getting at the guts of that class
* you expose certain methods for people to use outside that class.
* objective is to make as much as possible private within a program. It prevents cross contamination between classes
* You just want to have a few methods that defined public 
*/
class Plant {
	public static final String id = "007"; 		// you can use public but that would usually be when variables are both final and static.
												// if you do expose a class variable (class because it's static) usually 
												// that's just because it's a constant and can't be changed from outside the class
	private String name;   						// you always try to make variables private if you can. 
												// getters and setters are used to let people access this variable.
												// SOURCE - GENERATE GETTERS AND SETTERS - will auto generate the getter and setter methods for you
												// as seen below.
	private final static String ref = "Constant value can't be changed";			// because this is a constant final variable, when you generate the getter & setter methods you only get a getter, no setter. 
																					// eclipse recognises that this is a constant final variable that can't be set to something else.
	
	public static String getRef() {
		return ref;
	}

	public String getName() {			// These public methods are accessible from outside the class.
		return name;
	}

	public void setName(String name) { 
		this.name = name;
	}
	
	public String getData(){
		String data = "some stuff:    " + calcGrowth();
		return data;
	}
	
	private int calcGrowth() {					// this needs to be private to prevent people from getting at it from the outside.
		return 9;
	}
	
}
