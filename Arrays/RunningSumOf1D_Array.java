package Arrays;
import java.util.Scanner;
public class RunningSumOf1D_Array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        //printing the array before calculating running sum
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int sum=arr[0];
        for(int i=1;i<size;i++){
            sum+=arr[i];
            arr[i]=sum;
        }

        //printing the array after calculating running sum
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
