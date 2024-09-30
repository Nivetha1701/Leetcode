class Solution {
    public int triangleNumber(int[] nums) {
        int count=0;
        Arrays.sort(nums);
        for(int i=2;i<nums.length;i++)
        {
            int c=nums[i];
            for(int j=0;j<i;j++)
            {
                for(int k=j+1;k<i;k++)
                {
                    if(nums[j]+nums[k]>c)
                    {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}