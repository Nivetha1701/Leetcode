class Solution {
    public int arrangeCoins(int n) 
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(n>=i)
            {
                n-=i;
                sum++;
            }
            else 
            {
                break;
            }
        }
        return sum;
    }
}