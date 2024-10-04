import java.util.*;
import java.math.*;

class Solution {
    public int dominantIndex(int[] nums) {

        int n=nums.length;
        
        int max=Integer.MIN_VALUE;
        int index=0;
        int mul=1;
        for(int i=0;i<n;i++)
        {
            if(max<nums[i])
            {
                max=nums[i];
                index=i;
            }
        }
        for(int i=0;i<n;i++)
        {
            mul=2*nums[i];
            if(max<mul && i!=index)
            {
                return -1;
            }
        }
        return index;
    }
}