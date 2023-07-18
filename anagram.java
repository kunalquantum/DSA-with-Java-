import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        printMessage("We are inside the working of the Anagram in java",12);
        printMessage("defining Scanner class object",45);
        Scanner sc=new Scanner(System.in);
        printMessage("enter the first string",67);
        String s=sc.nextLine();
        printMessage("enter the second string",67);
        String t=sc.nextLine();
        boolean res=ana(s,t);
        printMessage("Printing the result",89 );
        if(res==true){
            printMessage("The string are anagram",90);

        }
        else{
            printMessage("The string is not anagram",90);
        }




    }
    static boolean ana(String s,String t){
        printMessage("inside the anagram implementation function",90);
        printMessage("checking if the length of the both the entered strings are same or not",90);
        if(s.length()!=t.length()){

            printMessage("the length of both the strings does not match",78);
            return false;

        }
        printMessage("the length of both strings matches",67);

        printMessage("converting the first string into array",78);
        char[] S=s.toCharArray();
        printMessage("converting the second string into array",67);
        char[] T=t.toCharArray();

        printMessage("sorting the array",90);
        Arrays.sort(S);
        Arrays.sort(T);

        printMessage("checking for wheater the strings are equavalent or not",54);

        return Arrays.equals(S,T);

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
