package L12;

import java.util.Scanner;

public class UserInput {
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = sc.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Give me a word");
		String str = sc2.nextLine();
		
		System.out.println("You entered "+str +" and " + num);
		
		
		
		
	}
	
	

}
