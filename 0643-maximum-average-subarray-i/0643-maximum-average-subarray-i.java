class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double sum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double maxSum = sum;

        // Slide the window
        for (int i = k; i < n; i++) {
            sum = sum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum / k;
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