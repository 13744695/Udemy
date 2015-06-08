package L15;

public class ArraysTutorial {
	public static void main (String []args){
		
		int value = 7;		// int is 32 bits
		
		int[] values;			// declares a name for the array of type int
		
		values = new int[4];	// 3 is the number of integers that can go in the array
								// default values will be zero for each of the 3 spaces
		
		values[0]= 0;
		values[1]= 1;
		values[2]= 2;
		values[3]= 3;
		
		
		
		System.out.println(values [0] + values [1] + values [2] + values [3]); // this statement will print out the addition of the 4 values.
		System.out.println(values [0]);
		System.out.println(values [1]);
		System.out.println(values [2]);
		System.out.println(values [3]);
		
		
		for(int i=0;i<values.length;i++){
			System.out.println(values[i]);
			
			
		}

		int [] numbers = {9,8,7,6,6,5,5,4,4,3,2,34};
		for (int j = 0;j<numbers.length;j++){
			System.out.print(numbers[j] +"\t");
			
		}
	
	}

}
