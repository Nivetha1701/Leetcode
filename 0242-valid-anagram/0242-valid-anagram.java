class Solution {
    public boolean isAnagram(String s, String t) {
       
       if(s.length()!=t.length())
       {
            return false;
       }
        char ch[]=s.toCharArray();
        Arrays.sort(ch);

        char c[]=t.toCharArray();
        Arrays.sort(c);
        
        return Arrays.equals(ch,c);
    }
}