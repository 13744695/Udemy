package L20;

import java.util.*;
public class testing1 {
	public static void main(String []args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Hi there, what is your name?");
		String n1 = sc.nextLine();
		hello(n1);
		
		
	}
	public static void hello(String name ) {
		
		System.out.println("Hi there "+name);
		askAge(name);
	}
	
	public static void askAge(String name){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Oh, I do like the name " +name + " May I ask what age you are please? ");
		int a1 = sc.nextInt();
		if(a1 < 13){
			System.out.println("Oh, you're only a baby, and so cute too");
		}
		else if(a1 >12 && a1<20){
			System.out.println("Ahhhh, so you're in your teens!!!");
		}
	
		else{
			System.out.println("So you are a grown up then. ");
		}
		address(name);	
		
	}
	public static void address(String name){
		Scanner sc = new Scanner(System.in);
		System.out.println("That's great!! So tell me something " + name +" Which town do you live in? ");
		String town = sc.nextLine();
		int visits = (int) (Math.random()*8) +1;
		System.out.println("Oh I've been to "+ town +" " +visits +"  times you know! I do like it");
		
	}


}

