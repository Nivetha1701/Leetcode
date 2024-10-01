class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=0;
        int sum=0;
        for(int i=0;i<weights.length;i++)
        {
            sum+=weights[i];
            if(max<weights[i])
            {
                max=weights[i];
            }
        }
          int lo=max;
          int hi=sum;
          int ans=0;
          while(lo<=hi)
          {
            int m=lo+(hi-lo)/2;
            int req_days=calculate(weights,m);
            if(req_days<=days)
            {
                ans=m;
                hi=m-1;
            }
            else 
            {
                lo=m+1;
            }
          }
          return ans;
    }

    public int calculate(int weights[],int m)
    {
        int days=1;
        int sum=0;
        for(int w:weights)
        {
            if(sum+w>m)
            {
                days++;
                sum=0;
            }
            sum=sum+w;
        }
        return days;
    }
}