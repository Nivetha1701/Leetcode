class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        int count[]=new int[101];
        for(int i=0;i<nums.length;i++)
        {
            count[nums[i]]++;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(count[nums[i]]==1)
            {
                sum+=nums[i];
            }
        }
        return sum;
    }
}