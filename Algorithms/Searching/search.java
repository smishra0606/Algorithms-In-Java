package Algorithms.Searching;

public class search {
    public static void main(String[] args) {
        int arr[]={3,5,1,12,36,32,4};
        int key=12;
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                found=true;
                break;
            }
        }
        System.out.println(found);
    }
    
}
