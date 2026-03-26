class Solution {
    public String longestPalindrome(String s) {
        String longest="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String sub=s.substring(i,j+1);
                if(isPalindrome(sub)){
                    if(sub.length()>longest.length()){
                        longest=sub;
                    }
                }
            }
        }
        return longest;
    }
    public static boolean isPalindrome(String s){
        int n=s.length();
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}