import java.util.Scanner;

public class floor {
    static int floor(int[] dol,int target){
        int left=0;
        int right=dol.length;
        int res=-1;

        while(left<right){
            int mid=left+(right=left);

            if(dol[mid]==target){
                return left;
            } else if (dol[mid]>target) {
                right=mid-1;
            }else{
                res=dol[mid];
                left=mid+1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] dol=new int[4];
        Scanner sc=new Scanner(System.in);
        printMessage("emter the elements in the array",120);
        for (int i=0;i<dol.length;i++){
            dol[i]=sc.nextInt();
        }
        printMessage("enter the target to be searched for the floor ",120);
        int target= sc.nextInt();
        int read=floor(dol,target);
        if(read==-1){
            printMessage("Empty array ;(",120);
        }
        else {
            printMessage("Hurray!! its time to celebrate ",120);
            System.out.println(read);
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
