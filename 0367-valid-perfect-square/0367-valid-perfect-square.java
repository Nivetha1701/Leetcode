class Solution {
    public boolean isPerfectSquare(int num) {
        int ans=(int)Math.sqrt(num);
        int m = ans*ans;
        if(m==num)
        {
            return true;
        }
        return false;

        // if(num==0 || num==1)
        // {
        //     return true;
        // }
        // int low=0;
        // int high=num/2;
        // while(low<=high)
        // {
        //     int mid=low+(high-low)/2;
        //     if(num/mid==mid && num%mid==0)
        //     {
        //         return true;
        //     } 
        //     else if(mid<num/mid)
        //     {
        //         low=mid+1;
        //     }
        //     else 
        //     {
        //         high=mid-1;
        //     }
        // }
        // return false;
    }
}