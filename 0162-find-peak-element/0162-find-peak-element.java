class Solution {
    public int findPeakElement(int[] nums) {

        int peak=Integer.MIN_VALUE,index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>peak){
                peak=nums[i];
                index=i;
            }
        }
        return index;
    }
}