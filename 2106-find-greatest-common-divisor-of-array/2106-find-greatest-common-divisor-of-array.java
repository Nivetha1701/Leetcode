import java.util.*;
import java.math.*;
class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int small=nums[0];
        int large=nums[nums.length-1];
        return gcd(small,large);
    }
    public int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    
    // public int findGCD(int[] nums) {
    //     Arrays.sort(nums);
    //     int small=nums[0];
    //     int large=nums[nums.length-1];
    //     return BigInteger.valueOf(small).gcd(BigInteger.valueOf(large)).intValue();
    // }
}