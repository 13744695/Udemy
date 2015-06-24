package L30;

public class Plant {
	
	public String name;							// because this is public it can be accessed from anywhere within Plant 
												// it's generally bad practice to declare variables as being public
												// you would generally want to encapsulate them and hide them away from the world
												// making them accessible through methods.
												// if you do it's usually a constant, and it's most often then declared static 
												// this is NOT considered bad practise now.
												// rem, final means constant.
	
	public final static int id = 8;
	
	private String type;						// this can only be accessed from within this class/
	protected String size;
	
	
	
	
	public Plant(){
		this.name = "My name is Cact-Gus";
		this.size = "medium";
		this.type = "Tree";
	}

}
												// protected is used when you don't want the variable etc to be public, but you do want it to be accessible to child classes
												// protected can be accessed with the same package.
// SUMMARY
// private only within same class
// public from anywhere
// protected subclass and same package
// no modifier same package only
