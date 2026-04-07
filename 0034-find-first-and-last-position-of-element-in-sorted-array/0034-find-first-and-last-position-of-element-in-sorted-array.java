class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int first=-1;
        int last=-1;
        boolean found1=false;
        boolean found2=false;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target && found1==false)
            {
                first=i;
                found1=true;
            }
            if(nums[nums.length-i-1]==target && found2==false){
                last=nums.length-i-1;
                found2=true;
            }
        }
        return new int[]{first,last};
    }
}