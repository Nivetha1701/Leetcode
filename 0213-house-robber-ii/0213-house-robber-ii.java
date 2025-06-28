class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        if(n==0) return 0;
        return Math.max(houserob(nums,0,n-2),houserob(nums,1,n-1));
    }
    public int houserob(int nums[],int start,int end){
        int rob=0;
        int notRob=0;
        for(int i=start;i<=end;i++){
            int current=Math.max(rob,notRob+nums[i]);
            notRob=rob;
            rob=current;
        }
        return rob;
    }
}