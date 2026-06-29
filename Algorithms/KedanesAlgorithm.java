package Algorithms;
import java.util.*;
public class KedanesAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int curr=0;
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            curr+=arr[i];
            if(curr>max){
                max=curr;
            }
            if(curr<0){
                curr=0;
            }
        }
        System.out.println(max);
    }
}
