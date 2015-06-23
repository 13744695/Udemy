package L29;

public class MainClass {
	public static void main(String args[]){
		
		Machine m1 = new Machine();					
		m1.start();
		Info info1 = new Machine();					// here a new object is created that uses the interface. The reason it can be done is because the MAchine class implements the interface
													// this object will only be able to access the methods that are in the interface, not the start method that is in the machine class. 
													// the next line of code info1.showInfo(); once you type the dot you will see you cannot access the start method that is in the machine class with this object
													//
		info1.showInfo();
		info1.testing();
		
		Person p1 = new Person("Jules");
		p1.greet();
		Info info2 = p1;							// in this example we are pointing info2 to the person object already created.
		
		info2.showInfo();
		info2.testing();
		System.out.println();

		outputInfo(m1);
		outputInfo(p1);
		
		// Machine and Person are two arbituary objects with nothing in common.
		// However supposing you want both to have a method called showInfo
		// This is where a new interface can be created. 
		// Go to interface called Infor.java to see more notes on this.
	}
	
	private static void outputInfo(Info info){			// methods are usually static, but this one has to be static because there's no MainClass object here
			info.showInfo();
			info.testing();
		
	}

}
