class Solution {
        public int numIdenticalPairs(int[] A) {
        int ans = 0;
        int cnt[] = new int[101];
        for (int a: A) {
            ans += cnt[a];
            cnt[a]++;
        }
        return ans;
    }
}