class Solution {
    public List<Integer> majorityElement(int[] nums) {

        Arrays.sort(nums);
        int n=nums.length;
        ArrayList<Integer> result=new ArrayList<>();
       
        int count=1;
        int max=n/3;
        
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            {
                count++;
            }
            else 
            {
                if(count>max)
                {
                    result.add(nums[i-1]);
                }
                count=1;
            }
        }
        if(count>max)
        {
            result.add(nums[n-1]);
        }
        return result;
    }
}