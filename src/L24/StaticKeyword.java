package L24;
//________________________________________Main application class____________________________________
public class StaticKeyword {
	public static void main(String[]args){
		
		Thing t1 = new Thing();
		Thing t2 = new Thing();
		Thing t3 = new Thing();
		Thing t4 = new Thing();
		t1.name = "Bob";
		t2.name = "Sue";
		t3.name = "Pat";
		t4.name = "Dee";
		
		System.out.println(t1.name);
		System.out.println(t2.name);
		System.out.println(t3.name);
		System.out.println(t4.name);
		
		Thing.desc = "I am a thing";
		System.out.println(Thing.desc);
		System.out.println("Quiz Time");
		System.out.println("Non Static variables are called? : ");
		System.out.println("Static variables are also known as? :");
		System.out.println("How many copies can there be of static variables? :");
		System.out.println("How many copies can there be of non-static variables? :");
		System.out.println("Each object does not get it's own copy of which type of variable? Static or Non-Static? :");
	}

}


//____________________________________________Thing class____________________________________________

class Thing{
	public String name;						// non static variables are called instance variables. 
	public static String desc;				// static variables also known as class variables belongs to the class. There's only one copy, as there's only one class.
											// So to access desc, you go through the class. Thing.desc = "I am a static class variable of type thing";
											// each object does not get it's own copy. 
	
											// for simplicities sake, these are being declared as public, you'd most often declare as private
	

}