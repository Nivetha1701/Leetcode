class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<=n-2;i++){
            String s=Integer.toString(n,i);
            if(!isPalindrome(s)){
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome(String s){
        StringBuilder str=new StringBuilder(s);
        String rev=str.reverse().toString();
        if(rev.equals(s)) return true;
        else return false;
    }
}