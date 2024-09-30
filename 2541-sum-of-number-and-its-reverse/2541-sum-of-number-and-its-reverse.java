class Solution {
    public static int reverse(int n)
    {
            int ans=0;
            while(n>0)
            {
                int rev=n%10;
                ans=ans*10+rev;
                n=n/10;
            }
            return ans;
    }
    public boolean sumOfNumberAndReverse(int num) {

            int ans=0;
            if(num==0)
            {
                return true;
            }
            for(int i=0;i<num;i++)
            {
                int re=reverse(i);
                if(i+re==num)
                {
                    return true;
                }
            }
        return false;
    }
}