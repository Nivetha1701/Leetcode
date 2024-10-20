class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        String longest="";
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                String curr=s.substring(i,j+1);
                if(isPalindrome(curr))
                {
                    if(longest.length()<curr.length())
                    {
                        longest=curr;
                    }
                }
            }
        }
        return longest;
    }
    public boolean isPalindrome(String s)
    {
        int n=s.length();
        for(int i=0;i<n/2;i++)
        {
            if(s.charAt(i)!=s.charAt(n-i-1))
            {
                return false;
            }
        }
        return true;
    }
}