class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n=nums.length;
        int ans[]=new int[n];
        int p[]=new int[n];
        Arrays.fill(p,1);
        int s[]=new int[n];
        Arrays.fill(s,1);
        ans[0]=1;
        for(int i=1;i<n;i++)
        {
            p[i]=p[i-1]*nums[i-1];
        }
        for(int i=n-2;i>=0;i--)
        {
            s[i]=s[i+1]*nums[i+1];
        }
        for(int i=0;i<n;i++)
        {
            ans[i]=p[i]*s[i];
        }
        return ans;

    }
}