class Solution {
    public int jump(int[] nums) {
        int goal=0;
        int end=0,jumps=0;
        for(int i=0;i<nums.length-1;i++){
            goal=Math.max(goal,i+nums[i]);
            if(i==end){
                jumps++;
                end=goal;
            }
        }
        return jumps;
    }
}