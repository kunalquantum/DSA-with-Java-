import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class array_to_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //to string method converts the array into the string
        int[] him=new int[5];
        for(int i:him){
            him[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(him));

    }
}
