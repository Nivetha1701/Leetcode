class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double max=sum;
        for(int i=k;i<nums.length;i++){
            sum=sum-nums[i-k]+nums[i];
            max=Math.max(max,sum);
        }
        return max/k;
        // double max=Double.NEGATIVE_INFINITY;
        // double sum=0;
        // for(int i=0;i<nums.length;i++){
        //     sum+=nums[i];
        //     if(i>=k){
        //         sum-=nums[i-k];
        //     }
        //     if(i>=k-1){
        //         max=Math.max(max,sum);
        //     }
        // }
        // return max/k;
    }
}