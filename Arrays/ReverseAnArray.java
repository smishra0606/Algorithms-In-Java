package Arrays;
import java.util.Scanner;
public class ReverseAnArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        //printing the array before reversing
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int a=0;
        int n=size-1;
        while(a<n){
            int temp=arr[a];
            arr[a]=arr[n];
            arr[n]=temp;
            a++;
            n--;
        }

        //printing the array after reversing
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }        
    }
}
