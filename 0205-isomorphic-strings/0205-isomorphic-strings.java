class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length()!=t.length())
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            //stores the index of first occurence of that char
            //in foo and bar it stores index of o as 1 and a as 1
            // when o comes again its index is 1 and r is index 2 so return false
            if(s.indexOf(s.charAt(i))!=t.indexOf(t.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }
}