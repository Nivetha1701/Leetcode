class Solution {
    public int rob(int[] nums) {
        int rob=0;
        int notRob=0;
        for(int i=0;i<nums.length;i++){
            int current=Math.max(rob,notRob+nums[i]);
            notRob=rob;
            rob=current;
        }
        return rob;
    }
}