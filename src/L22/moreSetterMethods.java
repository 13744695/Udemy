package L22;

//_________________________________Main Application Class_____________________________________________________________

public class moreSetterMethods {
	public static void main (String []args){
		
		
		Frog f1 = new Frog();
		
		f1.name="Bertie";			// accessing the variables directly from the Frog class. (setting the name with an equal sign.)
		f1.age=1;					// accessing the variables directly from the Frog class.
									// these could not access the variables name and age in the Frog class if the variables were set 
									// as private. However the getter and setter methods can still operate, they're protected.
		System.out.println("f1 is called: " +f1.getName() +"  and he/she is : " +f1.getAge() +" years old");
		Frog f2 = new Frog();
		f2.setName("Ray");			// here we're calling a method to 'set' the name equal to 'ray'
		f2.setAge(15);
		System.out.println("f2 is called: " +f2.getName()+"  and he/she is : " +f2.getAge() +" years old");
	}

	

}

//_____________________________________New Frog Class_______________________________________________________
class Frog{
	String name;
	int age;
	
	
	public String getName(){			// getter methods allow you to name, in this instance, all frog objects with a name 
									// without needing to write the name code out for each one separately.
									// in this instance the code is short but it could be more involved. 
		this.name = name;
		return name;
		}
	
	public int getAge(){
		this.age =age;				// allows the same named variable to be used in both. In other words, the brackets could have (int age) in the method parameters
		return age;
	}
	
	public void setName(String newName) {
		name = newName;				// uses the variable set at top of the class, and feeds in a value into it. 
		
	}
	
	public void setAge(int newAge){
		age = newAge;				// uses the variable set at top of the class, and feeds in a value into it. 
	}
}