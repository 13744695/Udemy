package L27;

public class Car extends Machine {	// car is a child class of the Machine class or inherits from Machine which is called the super class.
	
	@Override												// note this has a capital O
	public void start(){
		
		System.out.println("Car started");					// This method is in the parent class. ie there's a start method there too. 
															// but if you call c1.start now in the main method the one here takes precedence
															// eclipse has a shortcut - right click source, override implement methods, choose the method you want to override it will be pulled in
															// you can over type the body of the method this way either. 
															// @Override is also brought in by eclipse just before the method. You can type this in yourself too if you didn't use the shortcut.
															// It will check that this method is a 'copy' of one. If there's a spelling error it will pick it up and warn you
															// if you don't put this in and misspelt the method name it would presume that the mispelt method was a method in it's own right. 
		
	}
	public void wipeWindShield() {
		System.out.println("Wiping windshield ");
	}
	
	public void showMachineModel(){
		
		System.out.println("car model is: " + name2);		// this name2 can be accessed from the machine class because it's not marked private
															// the variable name cannot because it is private.
		System.out.println("Car serial type is: +name3");	// this variable can me accessed from anywhere within the package but not from outside the package.
	}
}
