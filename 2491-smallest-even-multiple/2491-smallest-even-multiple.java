class Solution {
    public int smallestEvenMultiple(int n) {
        int res=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0 && i%n==0)
            {
                return i;
            }
        }
        return n*2;
    }
}