package L14;

import java.util.Scanner;

public class SwitchStatements {
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a command");
		String text = sc.nextLine();
		
		switch(text){
		
		case "start":	System.out.println("Machine is starting ");		break;
		case "stop":	System.out.println("Machine is stopping"); 		break;
		case "slow":	System.out.println("Machine is slowing down"); 	break;
		case "fast":	System.out.println("Machine is speeding up"); 	break;	
		default: 		System.out.println("Unknown Command"); 		
		
		}
		
	}

}
