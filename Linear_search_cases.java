import java.util.Scanner;

public class Linear_search_cases {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={12,56,435,56,435,5,6,5,45};
        System.out.println("Enter the target element");
        int target=sc.nextInt();
        int res=Linear_search(arr,target);
        if (res==-1){
            System.out.println("Element not found but array is not empty");
        } else if (res==-2) {
            System.out.println("Array is empty");

        }
        else{
            System.out.println("The element "+res+" is found ");
        }

    }
    static int Linear_search(int[] arr,int target){
        //checking for the array is empty
        if(arr.length==0){
            return -2;
        }
        //checking for the target element
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]==target){
                if(i==0) {
                    System.out.println("Best case satisfied" + " the element found at " + i);
                } else if (i< arr.length-1) {
                    System.out.println("Average case satisfied"+" the element found at "+ i);

                }
                else{
                    System.out.println("Worst Case satisfied "+" the element found at "+ i);
                }
                return target;
            }

        }
        return -1;
    }
}
