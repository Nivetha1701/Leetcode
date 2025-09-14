class Solution {
    public String reverseStr(String s, int k) {
        int n=s.length();
        if(n<=k){
            return new StringBuilder(s).reverse().toString();
        } else if(n<2*k && n>=k){
            return new StringBuilder(s.substring(0,k)).reverse().toString()+ s.substring(k);
        } else{
            return new StringBuilder(s.substring(0,k)).reverse().toString()+ 
            s.substring(k,2*k) + reverseStr(s.substring(2*k),k);
        }
    }
}