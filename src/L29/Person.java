package L29;

public class Person implements Info {
	
	private String name;
	
	public Person(String name) {
	
		this.name = name;
		// constructor - obvious because it has the same name3 as the class
	}
	
	public void greet(){
		System.out.println("This is a class method - Hello there.");
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("This is an interface method - Person name is "+name);
	}

	@Override
	public void testing() {
		// TODO Auto-generated method stub
		System.out.println("This is an interface method - testing testing a second interface method in the person class");
	}
}
