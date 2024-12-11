class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++)
        {
            StringBuilder sb=new StringBuilder(words[i]);
            StringBuilder s=sb.reverse();
            if(words[i].equals(s.toString()))
            {
                return words[i];
            }
        }
        return "";
    }
}