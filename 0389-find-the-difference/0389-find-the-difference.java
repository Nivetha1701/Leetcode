class Solution {
    public char findTheDifference(String s, String t) {
        String str="";
        char s1[]=s.toCharArray();
        char t1[]=t.toCharArray();
        char ch=' ';
        Arrays.sort(s1);
        Arrays.sort(t1);
        for(int i=0;i<t1.length;i++)
        {
            if(i>=s1.length)
            {
                return t1[i];
            }
            else if(i<s1.length && s1[i]!=t1[i])
            {
                return t1[i];
            }
        }
        return ' ';
    }
}