package L29;

public class Machine implements Info {		// implements the Info interface. You will need to add the unimplement methods which pops up as the @Override 
											// below
	
	private int id = 7;
	
	
	
	
	public void start(){
		System.out.println("This is a class method - Machine Started");
	}




	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("This is an interface method - machine id is " + id);
	}



	@Override
	public void testing() {
		// TODO Auto-generated method stub
		System.out.println("This is an interface method - testing is running in the machine class");
	}
}
