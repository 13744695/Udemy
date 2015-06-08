package L11;

public class IfStatements {
	public static void main (String args[]){
		
		boolean cond = 1<6;
		System.out.println(cond); // will display true because the value in cond is true.
		
		
		// a single equals sign is an assignment
		// a double equals sign is a comparison
		
		int num = 5;
		
		if(num<4){
			
			System.out.println("yes it's true this num is less than 4");
		}
		else if(num>4)
		{
			System.out.println("this num is greater than four");
		}
		else{
			System.out.println("this num must be equal to 4");
		}
		
		int loop = 0;
		while (loop < 5){
			System.out.println("LOOPING : "+loop);
			loop++;
			
		}
			
	}

}
