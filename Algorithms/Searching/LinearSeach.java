package Algorithms.Searching;
import java.util.Scanner;
public class LinearSeach {
    public static boolean LinearSeach(int arr[], int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={3,5,1,12,36,32,4};
        int key=12;
        System.out.println(LinearSeach(arr, key));
    }    
}
