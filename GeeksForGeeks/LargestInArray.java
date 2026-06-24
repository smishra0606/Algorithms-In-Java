class Solution {
    public static int largest(int[] arr) {
        int large=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>large){
                large=arr[i];
            }
        }
        return large;
    }
}
