class Solution {
    public boolean isPowerOfTwo(int n) {
        // Approach :2
        // if(n==1) return true;
        // if(n<=0 || n%2!=0) return false;
        // return isPowerOfTwo(n/2);

        // Approach :1
        if(n>0 && (n&(n-1))==0)
        {
            return true;
        }
        return false;
    }
}