import java.util.Scanner;

public class multi_dim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for matrix 1: ");
        int row1 = sc.nextInt();
        System.out.println("Enter the number of columns for matrix 1: ");
        int col1 = sc.nextInt();
        int[][] matrix1 = new int[row1][col1];

        System.out.println("Enter the elements for matrix 1: ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the number of rows for matrix 2: ");
        int row2 = sc.nextInt();
        System.out.println("Enter the number of columns for matrix 2: ");
        int col2 = sc.nextInt();
        int[][] matrix2 = new int[row2][col2];

        System.out.println("Enter the elements for matrix 2: ");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        if (col1 != row2) {
            System.out.println("Error: The number of columns in matrix 1 should be equal to the number of rows in matrix 2 for matrix multiplication.");
            return;
        }

        int[][] resultMatrix = new int[row1][col2];

        // Perform matrix multiplication
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Display the result matrix
        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
