package Algorithms.Searching;

public class BinarySearch {
    public static int BinarySearch(int arr[], int key){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=(start+end)/2;
            if(arr[mid]==key) return key;
            if(key>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;        
    }
    public static void main(String[] args) {
        int arr[]={3,6,7,8,9,12,15,17,38,78};
        int key=38;
        System.out.println(BinarySearch(arr, key));
    }
    
}
