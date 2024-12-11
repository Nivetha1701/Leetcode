class Solution {
    public int countDigits(int num) {
        int n=num;
        int count=0;
        while(n!=0)
        {
            int a=n%10;
            n=n/10;
            if(num%a==0)
            {
                count++;
            }
        }
        return count;
    }
}