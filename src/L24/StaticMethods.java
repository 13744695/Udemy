package L24;

public class StaticMethods {
	public static void main (String args[]){
		
		
		
		Thingzoid t1 = new Thingzoid();
		Thingzoid t2 = new Thingzoid();

		t1.name = "Bob";
		t2.name = "Sue";

		
	t1.showName();
	t2.showName();

		
		Thingzoid.desc = "I am a Thingzoid";
		System.out.println(Thingzoid.desc);
		
		
		
	}
}

//_______________________________________Thingzoid Class____________________________________________________

class Thingzoid{
	public String name;
	public static String desc;
	
	public void showName(){
		System.out.println(name);
		
		
	}
	
}








// Static Methods:
// 
// 
// 