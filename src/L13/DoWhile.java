package L13;

import java.util.Scanner;

public class DoWhile {
	public static void main(String args[]){
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		while(num!=5){
			System.out.println("Enter a number");
			num = sc.nextInt();
			
		}
		System.out.println("You got five!!");		*/
		
		int num;
		do{
			Scanner sc = new Scanner(System.in);
			System.out.println("Guess my number between 0 and 10");
			num = sc.nextInt();
		}
		while(num!=5);
		System.out.println("You got it, it's five!! Well done");
	}

}
