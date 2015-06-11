package L20;
				// encapsulation: Means isolating the data in a class so that it's hidden from other classes. 
				// getters and setter are useful here.
				// Setting variables to private makes this happen. 
				// You would then have to get to these variables via getter or setter methods only

class Person{								// it's not wrong to create a class in the same file as another class
	String name;
	int age;
		
		void Speak(){						// method
			System.out.println("Hello there, My name is "+name + ". I'm " +age + " years old. Pleased to meet you");
		
		}
		void CalcYrsToRetirement(){			// method
			System.out.println("My name is "+ name + ". It'll be " +(65-age) +" years to my retirement. ");
		}
		int CalcYrsToRetire(){				// method that returns an int
			int yearsLeft = 65-age;
			return yearsLeft;				// when you have a return value from a method you can set a variable = to this return value
											// from the main method. For example
											// int yearsp1= p1.CalcYrsToRetire(); then sysout yearsp1
		}
		int getAge(){						// getter method that returns an int
			return age;
		}
		String getName(){					// getter method that returns an int
			return name;
		}
}

public class GetSet {
	public static void main(String [] args){
		Person p1 = new Person();			// Creating a person object
		Person p2 = new Person();			
		Person p3 = new Person();
		p1.name="Terry";					
		p2.name="Sinead";
		p3.name="Bronage";
		p1.age=23;
		p2.age=45;
		p3.age=3;
		
		p1.Speak();
		p2.Speak();
		p3.Speak();
		p2.CalcYrsToRetirement();
		p1.CalcYrsToRetirement();
		p3.CalcYrsToRetirement();
		int age = p1.getAge();
		String name = p2.getName();
		System.out.println("Name is: " +name);
		System.out.println("Age is: " + age);
		
		
	}

}
