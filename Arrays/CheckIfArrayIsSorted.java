package Arrays;
import java.util.Scanner;
public class CheckIfArrayIsSorted {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        boolean sorted=true;
        for(int i=0;i<size-1;i++){
            if(arr[i]>arr[i+1]){
                sorted=false;
                break;
            }
        }
        if(sorted){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted");
        }
    }
}
