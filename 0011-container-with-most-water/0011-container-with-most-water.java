class Solution {
    public int maxArea(int[] height) {
        
        int max=0;
        int n=height.length;
        int left=0;
        int right=n-1;
        while(left<right)
        {
            int ans=(right-left)*Math.min(height[left],height[right]);
            max=Math.max(ans,max);

            if(height[left]<height[right])
            {
                left++;
            }
            else 
            {
                right--;
            }
        }
        return max;
        
        // int max=Integer.MIN_VALUE;
        // int n=height.length;
        // for(int i=0;i<n-1;i++)
        // {
        //     for(int j=i+1;j<n;j++)
        //     {
        //         int ans=(j-i)*Math.min(height[i],height[j]);
        //         max=Math.max(ans,max);
        //     }
        // }
        // return max;
    }
}