package L20;
class Robot{

	public void speak(String text){
	System.out.println(text);
	}
	public void jump(int height){
		System.out.println("We jump " +height +" feet high off the groud");
	}
	public void move(String name, String direction, double distance){
		System.out.println(name +" is moving "+distance +" miles in direction " + direction);
		
	}
}

//---------------------------------------------------------------------------------------------------------------------



public class SetMethods {
	public static void main(String []args){
		
		Robot r1 = new Robot();
		r1.speak("hi I'm r1");
		r1.jump(7);
		r1.move("r1", "south", 10.3);
		String msg = "wuff, wuff, miow";
		r1.speak(msg);
	}

}
