package Algorithms.Searching;

public class BinartSearchByRecursion {
    public static boolean search(int[] arr,int left,int right, int key){
        if(left<right) return false;
        if(arr.length==0) return false;
        int mid=(left+right)/2;
        if(arr[mid]==key){
            return true;
        }
        else if(arr[mid]<key){
            return search(arr, mid+1, right, key);
        }
        else{
            return search(arr, left,mid-1, key);
        }
    }
    public static void main(String[] args) {
        int arr[]={3,5,1,12,36,32,4};
        int key=15;
        int start=0;
        int end=arr.length-1;
        System.out.println(search(arr, start, end, key));
    }
    
}
