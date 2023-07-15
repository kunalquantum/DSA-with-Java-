import java.util.Scanner;

public class array_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating the basic array
        int[] dark = new int[5];

        // Initializing specific indexes of the array
        dark[0] = 23;
        dark[3] = 45;
        dark[4] = 90;
        dark[1] = 89;

        // Printing the value at the third index of the array
        System.out.println("The value at index 3 is " + dark[3]);
        System.out.println("The value at index 1 is " + dark[1]);

        // Compile-time inputs
        int[] nebula = {23, 56, 78, 546, 34, 56};
        System.out.println("Displaying the inputs that were assigned during compile time:");
        for (int i = 0; i < nebula.length; i++) {
            System.out.println(nebula[i]);
        }

        // Runtime inputs
        System.out.println("Enter the elements in the array at runtime:");
        int[] black = new int[4];
        for (int i = 0; i < black.length; i++) {
            black[i] = sc.nextInt();
        }

        System.out.println("The output:");
        for (int i = 0; i < black.length; i++) {
            System.out.println(black[i]);
        }

        // Enhanced version of the for loop
        System.out.println("Enhanced version of the for loop:");
        for (int i : dark) {
            System.out.println(i + " ");
        }
    }
}