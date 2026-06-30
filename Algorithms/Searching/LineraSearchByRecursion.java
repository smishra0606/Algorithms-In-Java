package Algorithms.Searching;
import java.util.Scanner;
public class LineraSearchByRecursion {
    public static boolean search(int[] arr, int index,int key){
        if(arr.length==0) return false;
        if(arr[index]==key) return true;

        return search(arr,index+1,key);
        
    }
    public static void main(String[] args) {
        int arr[]={3,5,1,12,36,32,4};
        int key=12;
        System.out.println(search(arr,0, key));
    }
}
