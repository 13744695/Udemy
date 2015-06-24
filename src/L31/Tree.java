package L31;

public class Tree extends Plant {
	
	@Override											// Rem. source, override implement methods, is the shortcut
	public void grow(){									// this method overrides the same method in Plant
		System.out.println("Tree growing...");
	}

	@Override
	public void needsWater() {
		System.out.println("I need to be watered.... I'm a tree");
	}

	public void shedLeaves() {
		System.out.println("Leaves falling...");
	}
	
}
