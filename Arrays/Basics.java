package Arrays;

public class Basics {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        // for-each loop
        for(int i : arr){
            System.out.println(i);
        }
        // for loop
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
