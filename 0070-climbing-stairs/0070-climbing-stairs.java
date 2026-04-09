class Solution {
    public int climbStairs(int n) {
        // if(n<=2) return n;
        // return climbStairs(n-1)+climbStairs(n-2);
        int prev=0,curr=1;
        for(int i=0;i<n;i++){
            int next=prev+curr;
            prev=curr;
            curr=next;
        }
        return curr;
    }
}