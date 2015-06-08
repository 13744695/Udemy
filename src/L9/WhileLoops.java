package L9;

public class WhileLoops {
	public static void main (String []args){	// ctrl shft and f - formats the indentation
		
		boolean loop = (4<5);	//This will return true in the SOP
		boolean loopa = (4>5);	//This will return false in the SOP
		boolean loopb = true;	//This will return true in the SOP
		boolean loopc = false;	//This will return false in the SOP
		
		System.out.println(loop);
		System.out.println(loopa);
		System.out.println(loopb);
		System.out.println(loopc);
		
		int val = 10;
		boolean loopd = val <20;
		
		System.out.println(loopd);
		
		while(val<20){
			System.out.println("Hello");
			val++;					// alternatively (val = val + 1;)
		}
		
		
		System.out.println("The end");
		
		
		
		
	}

}
