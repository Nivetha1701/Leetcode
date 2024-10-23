class Solution {
    public boolean isMonotonic(int[] nums) {
        int n=nums.length;
        boolean increase=true;
        boolean decrease=true;
        for(int i=1;i<n;i++)
        {
            if(nums[i]>nums[i-1])
            {
                increase=false;
            }
            if(nums[i]<nums[i-1])
            {
                decrease=false;
            }
        }
        return increase || decrease;
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=i+1;j<n;j++)
        //     {
        //         if(nums[i]>nums[j])
        //         {
        //             increase=false;
        //         }
        //         if(nums[i]<nums[j])
        //         {
        //             decrease=false;
        //         }
        //     }
        // }
        // return increase || decrease;
    }
}