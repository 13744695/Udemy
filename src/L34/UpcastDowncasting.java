package L34;

public class UpcastDowncasting {
	public static void main(String[] args) {
		Machine m1 = new Machine();
		Camera c1 = new Camera();
		Machine m2 = new Camera();				// This is polymorphism
		Machine m6 = c1;
		Digger d1 = new Digger();
		Machine m7 = d1;
		Machine m3 = new Digger();				// We can't call the dig() method because this alone can only access methods common to both the parent and the child class.
	//	Digger d9 = m7;							// This gives an error saying cannot convert from machine to digger.
		Digger d9 = (Digger) m7;				// This works because we've cast the variable from being a Machine to being a digger. (It makes java happy that you know what you're doing - confirmation)
		
		m1.start();
		c1.start();
		c1.snap();
		m6.start();								// Even though this is a machine type m6, it was cast to type camera when we made Machine m6 = c1;
												// so the camera is started rather than the machine.
												// However the camera class also has a method called snap. And you can't say m6.snap();
												// because the Machine class doesn't have a snap method.
		d1.start();
		d1.dig();
		m7.start();	
		d9.dig();
	}
}

//________________________External Classes_________________________________________________________________________
class Machine {
	public void start()
	{
		System.out.println("Machine started");
	}
}


class Camera extends Machine {
	
	@Override
	public void start() {
	System.out.println("Camera starts...");
	}

	public void snap() {
		System.out.println("Say CHEESE!!!! - photo taken");
	}
}

class Digger extends Machine {

	@Override
	public void start() {
		System.out.println("Digger is now running.");
	}
	public void dig() {
		System.out.println("Digger is now digging a hole.");
	}
}
/*
* Upcasting and Downcasting or casting in general is a thing to do with variables.
* Once an object is created eg a Machine or Camera object
* The objects will always be whatever they started off being. 
* A Machine will always be a Machine, a Camera will be a Camera object
* In polymorphism we saw you can always use an object of a child class type 
* ... where you would expect an object of parent class type.
* So where the parent class is a machine, you could set m2 = a new camera.
* This is polymorphism.
* An alternative more subtle approach 
* Machine m6 = c1;    -    we've upcasted the ref m6 to variable type Camera.
* It's upcasting because of the hierarchy. We've gone up the class hierarchy from camera to machine.
* DOWNCASTING - 
*/