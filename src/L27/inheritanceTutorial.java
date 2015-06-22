package L27;

public class inheritanceTutorial {
	
	public static void main(String[] args) {
		
		
		Machine m1 = new Machine();											// inheritance 
		m1.start();
		m1.stop();
		
		
		Car c1 = new Car();
		c1.start();															// this method is called through the parent class of Machine
		c1.wipeWindShield();												// this is called from the car's own class
		c1.stop();															// this method is called through the parent class of Machine
		
			// most classes can be extended. unless they are final classes (I think)
		
		c1.showMachineModel();
	}

}
