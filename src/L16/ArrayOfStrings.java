package L16;

public class ArrayOfStrings {
	public static void main(String [] args){
		
		String [] str = new String[3];
		
		str [0]="Hello";
		str [1]=" to ";
		str [2]=" you!!";
		
		String [] str2 ={"hello ", "to ", "you ", "again "};
		
	for(int i = 0 ; i<str.length; i++){
		System.out.print(str[i]);
		
	}
	
	System.out.println();
	System.out.println();
	
	for(int i = 0 ; i<str2.length; i++){
		System.out.print(str2[i]);
	}

	System.out.println();
	System.out.println();
	
	for(String words: str2){					// special for loop. 
		System.out.print(words);
		
	}
	}

}
