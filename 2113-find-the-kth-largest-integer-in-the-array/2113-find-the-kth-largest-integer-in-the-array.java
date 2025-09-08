import java.math.*;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        int n=nums.length;
        BigInteger res[]=new BigInteger[n];
         for(int i=0;i<n;i++){
            res[i]=new BigInteger(nums[i]);
         }
         Arrays.sort(res);
         return String.valueOf(res[n-k]);
    }
}