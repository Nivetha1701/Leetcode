class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        return Math.max((nums[n-1]*nums[n-2]*nums[n-3]),(nums[0]*nums[1]*nums[n-1]));
        // int max=Integer.MIN_VALUE;
        // int n=nums.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         for(int k=j+1;k<n;k++){
        //             int prod=nums[i]*nums[j]*nums[k];
        //             if(prod>max){
        //                 max=prod;
        //             }
        //         }
        //     }
        // }
        // return max;
    }
}