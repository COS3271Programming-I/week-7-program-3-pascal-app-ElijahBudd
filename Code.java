package Project;
import java.util.Arrays;

public class Pascal_App {
	public static void main(String[] args) {
		
		System.out.println("Pascal's Triangle:");
		
		int[][] pascalGrid = new int[11][11]; // Create multi dimensional array
		
		// Build Pascal's Triangle
		for (int row = 0; row <= 10; row++) {
			for (int col = 0; col <= row; col++) {
				
				if (col == 0 || col == row) {
					pascalGrid[row][col] = 1; // Edges are always a 1
				} else {
					pascalGrid[row][col] = pascalGrid[row - 1][col] + pascalGrid[row - 1][col - 1];
				}
			}
		}
		
		// Print Pascal's Triangle
		for (int row = 0; row <= 10; row++) {
			for (int col = 0; col<= row; col++) {
				System.out.print(pascalGrid[row][col] + " ");
			}
			System.out.println();
			
		}
		
	}
}
