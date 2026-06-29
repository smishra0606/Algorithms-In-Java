class Solution {
    public int maxElement(int[] piles){
        int max=0;
        for(int i=0;i<piles.length;i++){
            if(max<piles[i]) max=piles[i];
        }
        return max;
    }
    public long totalHours(int[] piles, int k){
        long hours=0;
        for(int i=0;i<piles.length;i++){
            hours+=(piles[i]+k-1)/k;
        }
        return hours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=maxElement(piles);
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            long hours=totalHours(piles, mid);
            if(hours<=h){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}