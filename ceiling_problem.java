import java.util.Arrays;
import java.util.Scanner;

public class ceiling_problem {
   static int ceil(int[] box,int target){
       int left=0;
       int right= box.length-1;
       int res=-1;

       while(left<right){
           int mid=left+(right-left);
           if (box[mid]==target) {
               return box[mid];


           }
           else if(target<box[mid]){
               res=box[mid]; // suspected ceil value
               right=mid-1;
           }
           else{
               left=mid+1;
           }
       }
       return res;
   }

    public static void main(String[] args) {
        int[] box=new int[4];
        Scanner sc=new Scanner(System.in);
        printMessage("enter the target element",80);
        int target=sc.nextInt();
        printMessage("enter the element in the array (ascending sorted)",120);
        for (int i=0;i<box.length;i++){
            box[i]=sc.nextInt();
        }
        int rep=ceil(box,target);
        if(rep==-1){
            printMessage("the array provided is the empty",50);

        }
        else{
            printMessage("the ceiling is "+ rep,56);
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
