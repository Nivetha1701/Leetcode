class Solution {
    public int findPermutationDifference(String s, String t) {
        int sum=0;
        int n=s.length();
        int m=t.length();
        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);
            int index=t.indexOf(c);
            sum+=Math.abs(index-i);
        }
        return sum;
    }
}