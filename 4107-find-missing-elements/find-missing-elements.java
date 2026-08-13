class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        // List<Integer>ans=new ArrayList<>();
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length-1;i++) {
        //     if(nums[i]+1==nums[i+1]) continue;
        //     for (int j = nums[i] + 1; j < nums[i + 1]; j++) ans.add(j);
        // }
        // return ans;

        List<Integer>ans=new ArrayList<>();
        Set<Integer>set=new HashSet<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int num:nums) {
            min=Math.min(min,num);
            max=Math.max(max,num);
            set.add(num);
        }

        for(int i=min+1;i<max;i++) {
            if(!set.contains(i)) ans.add(i);
        }

        return ans;

    }
}