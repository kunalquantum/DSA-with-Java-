 import java.util.Arrays;
import java.util.Scanner;

public class bubble {
    public static void main(String[] args) {
        int[] array = new int[6];
        Scanner sc=new Scanner(System.in);
        printMessage("Welcome to the java code that explains itself while excuting ",20);
        printMessage("Enter the elements",20);
        for(int i=0;i<6;i++){
        array[i]= sc.nextInt();
        }

        printMessage("Before sorting: " + Arrays.toString(array),20);

        bubbleSort(array);

        printMessage("After sorting: " + Arrays.toString(array),20);
    }

    public static void bubbleSort(int[] array) {
        printMessage("Control inside the bubble sort function",20);
        int n = array.length;
        boolean swapped;
printMessage( "entering the first for loop ",20);
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
printMessage("entering the second for loop ",20);
            for (int j = 0; j < n - i - 1; j++) {
                printMessage("checking for the conditon of the sorting ",20);
                if (array[j] > array[j + 1]) {
                    printMessage("swapping the elements",20);
                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no two elements were swapped, the array is already sorted
            if (!swapped) {
                break;
            }
printMessage("printing the passses.....",120);
            // Additional effect: Print the current state of the array after each pass
            System.out.println("Pass " + (i + 1) + ": " + Arrays.toString(array));
        }

    }

    public static void printMessage(String message, int delay) {
        int length = message.length();
        for (int i = 0; i < length; i++) {
            char character = message.charAt(i);
            System.out.print(character);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

}

