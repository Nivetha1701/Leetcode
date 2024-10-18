class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int num1=0;
        int num2=0;
        boolean foundnum1=false;
        boolean foundnum2=false;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i]))
            {
                if(!foundnum1)
                {
                    num1=nums[i];
                    foundnum1=true;
                }
                else
                {
                    num2=nums[i];
                    foundnum2=true;
                }
            }
            else 
            {
                set.add(nums[i]);
            }

        }
        int ans[]={num1,num2};
        return ans;
    }
}