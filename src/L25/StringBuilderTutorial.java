package L25;

// string builder, string buffer and string formatting in java

public class StringBuilderTutorial {
	public static void main(String []args){
		

		
		
		String info = "";
		info += "My name is Bob";				// everytime you do this you're creating a brand new string. 
		info += " ";
		info += "I am a builder.";
												// String is immutable. You're not changing the original String with this example
												// You're creating a new String and reassigning the info variable to it. 
												//	          Inefficient - could slow a program 
		
		
		//_______________________________String builder object is the solution - much more efficient_____________________________
		
		
		System.out.println(info);
		
		StringBuilder sb1 = new StringBuilder ("");				// created a StringBuilder object
		
		sb1.append("My name is Sue. ");							// append to the original String - not creating a new String with this method.
		sb1.append("How do you do? ");							// just modifying the initial String
		sb1.append("I am a lion tamer!! ");						// a more memory efficient way.
		
		System.out.println(sb1);
		System.out.println(sb1.toString());						// he uses this in the lesson. Not sure of motivation just yet.
	
		StringBuilder sb2 = new StringBuilder("");
																// alternatively:
		sb2.append("My name is Patricia")						// note no completing semi colon.
		.append(" ")											// could be typed on the same line - chaining the methods.
		.append("I'm a doctor!") .append(" aged 78") .append(" and fighting fit");
		
		System.out.println(sb2.toString());						// even more efficient
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		//__________________________________String buffer_________________________________________________________________________
		
													// String buffer is used in instances where you're concerned with multi threading
													// it's a thread safe version of StringBuilder
													// String builder is newer than StringBuffer - you may come accross StringBuffer in older code
													// Tutor doesn't use this himself. And didn't give examples.
		
		
		//_________________________________Advanced String Formatting_____________________________________________________________
		
		///////   Formatting   ///////
		
		System.out.println("1. Here is some text \n That was a new line \t that was a tab.");
		System.out.print("2. Won't print a new line");
		System.out.println("3. get's stuck on end of last because no ln in last");
		System.out.println();
		System.out.println();
		System.out.printf("Now using 'f' instead of ln \n");
		System.out.printf("Total cost %d \n", 5);								// percent d gets replaced with the 5
		System.out.printf("total cost %d; Quantity %d \n", 5 , 120);			// two %d's separated by semicolon, then take in two parameters
																				// gives more control than concat
		
		System.out.printf("Total cost: %-10d; Quantity: %10d \n", 5, 10 );
		System.out.println("the %10d puts ten empty characters in before the value of 5, while the minus 10 puts them after the value of 10 \n");
		
		
		for (int i=0;i<20; i++){
			System.out.printf("%2d: %s  \n", i, "some text here");     //The 2 inside the %d gives the numbers a width of two which line them up nicely.
			
		}
		//// formating floating values ?////
		
		System.out.printf("total value: %.4f \n", 5.754646464);					// the .4 tells the floating point how many decimals are to be printed
		System.out.printf("total value: %17.4f \n", 5.754646464);				// the 17 (before the .4 tells the floating point it can take up 17 spaces, and is to be justified to the right of those 17 spaces)
	}

}
