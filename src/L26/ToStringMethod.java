package L26;

public class ToStringMethod {
	public static void main(String[] args) {
		
		Frog f1 = new Frog(7, "Fred");
		Frog f2 = new Frog(8, "Freda");
		Frog f3 = new Frog(9, "Freaky");
		
		//f1.toString();					// if you pause after pressing the dot here, you'll see all the methods the Frog class has inherited from it's parent 
										// object class, Object.
										// toString is really useful to help debug your applications
										// 
		
		// System.out.println(f1 +"\n" +f2 +"\n" +f3 ); 	// this isn't wrong but it's ineffiient so StringBuilder could be used	as below in the toString method
		
															// if you ran this without having a toString method in the Frog class this line would still run but the output would be:
															// L26.Frog@19e0bfd  looks like a memory address but is the hashcode - unique identifier for all objects in java
		
		
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		
		// alternatively you could:
		
		
		
		Object o1 = new Object();		// Object class is the parent of all object classes in java.
										// so even without writing a class for Object it already exists, and you can call various methods to it here too as with Frog method

		o1.toString();

	}

}

class Frog {
	
	private String name;
	private int id;
	
	
	public Frog(int id, String name){
		
		this.id =id;
		this.name = name;
	}
	public String toString() {
		
	/*	StringBuilder sb = new StringBuilder();
		sb.append(id);
		sb.append(": ");
		sb.append(name);
		
		return sb.toString(); 
		
		*/
		
		// alternatively you could:
		
		return String.format("%-5d: %15s", id , name);
	}
	
}
