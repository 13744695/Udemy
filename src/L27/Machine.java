package L27;

public class Machine {
	private String name = "Machine type 1";						// because this is private it can only be accessed within this class. 
																// you can't call this variable from the car class or the main class because it is private.
	String name2 = "Machine model 1";							// this one can be accessed from anywhere in the package now.
	protected String name3 = "Machine serial Type:  AX35E";		// This can be accessed from anywhere in the package also but is protected from outside the package as the name suggests.
	
	public void start(){
		
		System.out.println("Machine started");
	}
	
	public void stop(){
		System.out.println("Machine stopped");
		
	}
	

}
