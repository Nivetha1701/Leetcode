class Solution {
    public int jump(int[] nums) {
        int count=0;
        int goal=nums.length-1;
        int min=-2;
        while(min!=0 && min!=-1 && nums.length!=1)
        {
            min=-1;
            count++;
            for(int i=goal-1;i>-1;i--)
            {
                if(i+nums[i]>=goal)
                {
                    min=i;
                }
            }
            goal=min;
        }
        return count;
    }
}