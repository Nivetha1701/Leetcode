class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;   //if k is less than n ok 3%5=3 it will rotate from 3 index
        //else if k is greater than n then 7%5=2 it will rotate from 2 index
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