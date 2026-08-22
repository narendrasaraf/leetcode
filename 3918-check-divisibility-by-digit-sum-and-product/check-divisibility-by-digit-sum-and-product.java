class Solution {
    public boolean checkDivisibility(int n) {
        int original=n;
        int sum=0;
        int product=1;
        while(n>0) {
            sum+=n%10;
            product*=n%10;
            n/=10;
        }
        if(original%(sum+product)==0) return true;
        return false;
    }
}