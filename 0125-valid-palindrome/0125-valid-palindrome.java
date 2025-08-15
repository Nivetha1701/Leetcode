class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        s=s.toLowerCase();
        String s1="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if((c>='a' && c<='z') || (c>='0' && c<='9')){
                s1+=c;
            }
        }
        for(int i=s1.length()-1;i>=0;i--){
            str+=s1.charAt(i);
        }
        if(s1.equals(str)){
            return true;
        }
        return false;
    }
}