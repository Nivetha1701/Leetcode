class Solution {
    public int maximum69Number (int num) {
        String s=Integer.toString(num);
        int count=0;
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='6' && count<1){
                ans+="9";
                count++;
            } else{
                ans+=s.charAt(i);
            }
        }
        return Integer.parseInt(ans);
    }
}