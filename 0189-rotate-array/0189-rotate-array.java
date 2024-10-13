class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int j=0;
        int ans[]=new int[nums.length];
        for(int i=n-k;i<n;i++)
        {
            ans[j++]=nums[i];
        }
        for(int i=0;i<n-k;i++)
        {
            ans[j++]=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=ans[i];
        }
    }
}