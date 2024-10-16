class Solution {
    public int findTheWinner(int n, int k) {

        LinkedList<Integer> al=new LinkedList<>();
        for(int i=1;i<=n;i++)
        {
            al.add(i);
        }
        int curr=0;
    // k-1 is because we need to move k-1 position to reach kth friend
    // % al.size() is because when we reach end we again need to start from 1st pos
        while(al.size()>1)
        {
            curr = (curr+k-1) % al.size();
            al.remove(curr);
        }   
        return al.get(0);
    }
}