class Solution {
    public int missingNumber(int[] nums) {

        int num=0;
        int count=0;
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        if(max==0)
        {
            num=1;
        }
        for(int i=0;i<max;i++)
        {
            if(nums[i]!=i)
            {
                num=i;
                break;
            }
           
            else if(nums[i]==i)
            {
                count++;
            }
            if(count==nums.length-1)
            {
                num=max+1;
            }
        }
        return num;
    }
}