class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int curr=0;
        int max=0;
        for(int i=0;i<k;i++){
            max+=arr[i];
            curr=max;
        }
        for(int i=k;i<arr.length;i++){
            curr=curr+arr[i]-arr[i-k];
            if(curr>max){
                max=curr;
            }
        }
        return max;
    }
}