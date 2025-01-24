class Solution { 
    public boolean canJump(int[] nums) {
        int n=nums.length,goal=0;
        for(int i=0;i<n;i++){
            if(i>goal){
                return false;
            }
            goal=Math.max(goal,i+nums[i]);
        }
        return true;
        // int n=nums.length;
        // int goal=nums.length-1;
        // for(int i=nums.length-2;i>=0;i--)
        // {
        //     if(i+nums[i]>=goal)
        //     {
        //         goal=i;
        //     }
        // }
        // return goal==0;
    }
}