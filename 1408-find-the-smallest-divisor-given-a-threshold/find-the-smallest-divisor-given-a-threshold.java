class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=Integer.MIN_VALUE;
        for(int x:nums) {
            high=Math.max(high,x);
        }
        while(low<=high) {
            int mid=low+(high-low)/2;
            int temp=0;
            for(int num:nums){
                temp=temp+(num+mid-1)/mid;
            }
            if(temp<=threshold) high=mid-1;
            else low=mid+1;
        }
    return low;
    }
}