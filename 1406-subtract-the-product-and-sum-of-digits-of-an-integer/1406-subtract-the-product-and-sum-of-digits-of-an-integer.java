class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int prod=1;
        int m=n;
        while(m>0)
        {
            int a=m%10;
            sum+=a;
            prod*=a;
            m=m/10;
        }
        return prod-sum;
    }
}