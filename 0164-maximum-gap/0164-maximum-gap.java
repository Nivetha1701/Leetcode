class Solution {
    public int maximumGap(int[] nums) {

        int gap=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            int max=nums[i+1]-nums[i];
            if(gap<max)
            {
                gap=max;
            }
        }
        return gap;
        
    }
}