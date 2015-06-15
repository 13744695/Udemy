package L21;

import java.util.Scanner;

public class Calculator {
	public static void main(String []args){
		
		// Calculator program

		System.out.println("Welcom to your calculator program");
		scanCall();
		
		
	}
	public static void scanCall(){ // calls the scanner to start the input process
		Scanner sc = new Scanner(System.in);
		System.out.println("Type - add - sub - mul - div for your choice of calculation");
		String choice = sc.nextLine();
		System.out.println("Your choice was " +choice +".   Now, Please enter your first number");
		int num1 = sc.nextInt();
		System.out.println("Your first number is " +num1 +".   Now, Please enter your second number");
		int num2 = sc.nextInt();
		System.out.println(" Your second number is " +num2);
		calculator(choice, num1, num2);
		
	}
	
	public static void calculator(String choice, int num1, int num2){
		
		if (choice == "add"){
			int ans = num1+num2;
			System.out.println("Your first number added to your second number is  "+ans);
		}
		if (choice == "sub"){
		
				int ans = num1-num2;
				System.out.println("The result of your second number taken from your first number is  "+ans);
		}
		if (choice == "mul"){
			int ans = num1*num2;
			System.out.println("Your two numbers when multiplied give: " +ans);
		}
		if (choice =="div"){
			int ans = num1/num2;
			System.out.println("The result of your second num divided into your first number is: " + ans);
		}
		else{
			System.out.println("Your choice of calculation is invalid"); 
			Scanner sc = new Scanner(System.in);
			System.out.println("Try again? yes/no");
			String ans = sc.nextLine();
			if(ans == "yes" ){
				scanCall();
			}
			System.out.println();
			System.out.println("Do you want to try another calculation? yes/no");
			String ans2 = sc.nextLine();
			if(ans2 == "yes" ){
				scanCall();
			}
			
		}
	}
	


}
