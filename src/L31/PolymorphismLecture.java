package L31;

public class PolymorphismLecture {
	public static void main(String[] args) {
		Plant p1 = new Plant();
		Tree t1 = new Tree();
		
		Plant p2 = p1;					// it's possible to point one object to another both p1 and p2 are pointing at the same object
		Plant p3 = t1;					// this is ok because the Tree class is a child of the Plant class
										// can always use a tree whereever you have a plant, because tree is the subclass
		
		p1.grow();
		p2.grow();	
		p3.grow();						// p2 is pointing at the Tree object so the Tree grow method is called not the Plant grow method
		t1.shedLeaves();
	//	p2.shedleaves();				// error produced. shedLeaves method is in the Tree class. p2 is a Plant object
	//	p3.shedLeaves(); 				// error produced. This variable is a Plant not a tree. The decision lies with the variable.
		p1.needsWater();
		p2.needsWater();
		t1.needsWater();
		doGrow(t1);
		
	}
	
	public static void doGrow(Plant plant) {
		plant.grow();
	}

}


/*
	Polymorphism is an object oriented concept (word means many shapes)
	What polymorphism means in a nut-shell - if you have a child and parent class, 
	you can always you the child class anywhere where you would normally
	use the parent class.
	Some examples, you can have 
	
*/