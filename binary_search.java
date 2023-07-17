import java.util.Scanner;

public class binary_search {
     static int binary_s(int un[],int target) {


        int left=0; // left poiter
        int right=un.length; // right pointer
        for(int a=0; a<=un.length-1;a++){
            int mid=(left+right-left)/2;
            if(un[a]==target){
                System.out.println("the element is found in the "+a+"th iteration" );
                return mid;
            }
            else if(target<mid){
                //this suggest that target element is smaller then mid
                left=mid-1;
            }
            else{
                right=mid+1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("the basic binary search");
        Scanner sc= new Scanner(System.in);
        //the basic array provided
        int[] un=new int[6];
        System.out.println("enter the elements in the array ");
        for(int i=0;i<un.length;i++){
            System.out.print("enter : ");
            un[i]=sc.nextInt();
        }
        System.out.println("enter the numbr to be searched ");
        int target=sc.nextInt();

        int idx=binary_s(un,target);
        if(idx==-1){
            printMessage("Even after iterating the whole array we are unable to find your element",100);

        }
        else{
            printMessage("!! Hurrah.. Congratulation you element "+target+"is found successfully",100);
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

