class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String str=s+s;
        String sub=str.substring(1,str.length()-1);
        if(sub.contains(s)){
            return true;
        }
        return false;
    }
}