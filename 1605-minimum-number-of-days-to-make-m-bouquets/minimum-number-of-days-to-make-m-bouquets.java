class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        long need=(long)m*k;
        if(need > bloomDay.length) return -1;
        // search space
        for(int x:bloomDay) {
            high=Math.max(high,x);
            low=Math.min(low,x);
        }
        while(low<=high) {
            int mid = low + (high-low)/2;
            if(canMake(bloomDay,mid,m,k)) high=mid-1;
            else low=mid+1;
        }
        return low;
    }
        private boolean canMake(int[] bloomDay,int day,int m,int k){
        int bouquets = 0;
        int flowers = 0;
        for(int bloom : bloomDay){
            if(bloom <= day){
                flowers++;
            }
            else{
                bouquets += flowers / k;
                flowers = 0;
            }
        }
        bouquets += flowers / k;
        return bouquets >= m;
    }
}