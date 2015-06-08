package L17a;

public class TimesTables2DArray {

		public static void main(String []args){
			
			int grid [][] = new int[21][21];
			int i=0;
			int j=0;
			
			for(int r = 0;r<grid.length;r++){					// don't forget r comes before c
				for(int c = 0;c<grid[r].length;c++){			// as you're doing multiplication need to declare two ints i and j
					grid [r][c]= i*j;							// again as its mult, need to mult i * j & to think about where the i needs to reset to zero
					System.out.print(grid[r][c] + "\t");		// and to think about when the j needs to incement. placing is everything
					i++;										//
				}
				System.out.println();
				System.out.println();
				i=0;
				j++;
				
			}
			
		}

	}
