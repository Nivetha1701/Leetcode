class Solution {
    public int minOperations(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            set.add(nums[i]);
        }
        for(int i=0;i<n;i++)
        {
            if(nums[i]<k)
            {
                set.remove(nums[i]);
                count++;
            }
        }
        return count;
    }
}