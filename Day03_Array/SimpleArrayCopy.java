package Day03_Array;

import java.util.Scanner;

public class SimpleArrayCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        int[] flat = new int[rows * cols];
        int index = 0;

        // Input and copy in same loop
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
                flat[index++] = matrix[i][j];
            }
        }

        // Output 1D array
        for (int i = 0; i < flat.length; i++) {
            System.out.print(flat[i] + " ");
        }

        sc.close();
    }
}
