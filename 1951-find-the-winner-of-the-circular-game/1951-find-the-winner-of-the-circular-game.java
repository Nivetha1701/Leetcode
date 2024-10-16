class Solution {
    public int findTheWinner(int n, int k) {

        LinkedList<Integer> al=new LinkedList<>();
        for(int i=1;i<=n;i++)
        {
            al.add(i);
        }
        int curr=0;
        while(al.size()>1)
        {
            curr=(curr+k-1) % al.size();
            al.remove(curr);
        }   
        return al.get(0);
    }
}