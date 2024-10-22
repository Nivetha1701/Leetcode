class Solution {
    public int[] buildArray(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int j=0;
        for(int i=0;i<n;i++)
        {
            ans[j++]=nums[nums[i]];
        }
        return ans;
    }
}