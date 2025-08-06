class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double max=Double.NEGATIVE_INFINITY;
        double sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(i>=k){
                sum-=nums[i-k];
            }
            if(i>=k-1){
                max=Math.max(max,sum);
            }
        }
        return max/k;
    }
}