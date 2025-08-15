class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String s1="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if((c>='a' && c<='z') || (c>='0' && c<='9')){
                s1+=c;
            }
        }
        StringBuilder str=new StringBuilder(s1);
        String pal=str.reverse().toString();
        if(s1.equals(pal)){
            return true;
        }
        return false;
    }
}