class Solution {
    public String greatestLetter(String s) {
        
        HashSet<Character> lower=new HashSet<>();
        HashSet<Character> upper=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(Character.isLowerCase(c))
            {
                lower.add(c);
            }
            if(Character.isUpperCase(c))
            {
                upper.add(c);
            }
        }
        String ans="";
        for(char i='Z';i>='A';i--)
        {
            if(lower.contains(Character.toLowerCase(i)) && upper.contains(i))
            {
                ans+=i;
                break;
            }
        }
        return ans;
    }
}