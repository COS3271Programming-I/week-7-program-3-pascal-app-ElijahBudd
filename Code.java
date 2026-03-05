package Project;
import java.util.Arrays;

public class Pascal_App {
	public static void main(String[] args) {
		
		System.out.println("Pascal's Triangle:");
		
		int[][] pascalGrid = new int[11][11];
		
		for (int row = 0; row <= 10; row++) {
			for (int col = 0; col <= row; col++) {
				
				if (col == 0 || col == row) {
					pascalGrid[row][col] = 1;
				} else {
					pascalGrid[row][col] = pascalGrid[row - 1][col] + pascalGrid[row - 1][col - 1];
				}
			}
		}
		
		for (int row = 0; row <= 10; row++) {
			for (int col = 0; col<= row; col++) {
				System.out.print(pascalGrid[row][col] + " ");
			}
			System.out.println();
			
		}
		
	}
}
