package L17;

public class MultDArrays {

		public static void main(String []args){

			int [][] grid = {
					{3,4,6,7,8},{4,5,6,2},{8,7,6,5,3,2}

			};

			System.out.println(grid[1][1]);
			
			String[][] texts = new String[2][3];
			System.out.println(texts[0][1]); 				// default is null if array is empty
			
			
		
		
			for(int r = 0;r<grid.length;r++){						// magic for loop for printing all elements in a 2d array
																	// note r is for rows and c is for cols
				for(int c = 0;c<grid[r].length;c++){				// as always you think in terms of rows first then cols. RC
					System.out.print(grid[r][c] + "\t");			// \t places a tab on the screen
																	// the blank sysout line moves everything onto the next line
					}
				System.out.println();
				}
		}
	}
