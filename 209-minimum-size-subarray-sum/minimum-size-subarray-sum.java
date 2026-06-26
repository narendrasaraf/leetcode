class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int j=0;
        int sum=0;
        int answer=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++) {
            sum=sum+nums[i];
            while(sum>=target) {
                answer=Math.min(answer,i-j+1);
                sum=sum-nums[j];
                j++;
            }
        }
        if(answer==Integer.MAX_VALUE) return 0;
        return answer;
    }
}