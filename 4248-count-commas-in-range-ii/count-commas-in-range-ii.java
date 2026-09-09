class Solution {
    public long countCommas(long n) {
        if(n<=999) return 0;
        long ans=0;
        long curr=1000;
        while(curr<=n) {
            ans+=n-curr+1;
            curr*=1000;
        }
        return ans;
    }
}