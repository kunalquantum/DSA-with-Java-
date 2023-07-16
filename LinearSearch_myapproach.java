import java.util.Scanner;

public class LinearSearch_myapproach {
    public static void main(String[] args) {
        int[] obs={12,45,67,45,34,56};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the element to be searched for: ");
        int target=sc.nextInt();
        int c=0;
        for (int i=0;i<=obs.length-1;i++)
        {
            if(obs[i]==target){
                System.out.println("THe element "+target+" is found at index "+i);
                System.out.println("THe element "+target+" is found at position "+i+1);
                c++;
                break;
            }

        }
        if(c==0){
            System.out.println("the element is not found in the array");
        }

    }
}
