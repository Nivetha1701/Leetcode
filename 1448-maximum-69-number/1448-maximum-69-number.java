class Solution {
    public int maximum69Number (int num) {
        return Integer.parseInt(Integer.toString(num).replaceFirst("6","9"));

        // char digits[]=Integer.toString(num).toCharArray();
        // for(int i=0;i<digits.length;i++){
        //     if(digits[i]=='6'){
        //         digits[i]='9';
        //         break;
        //     }
        // }
        // return Integer.parseInt(new String(digits));

        // String s=Integer.toString(num);
        // int count=0;
        // String ans="";
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)=='6' && count<1){
        //         ans+="9";
        //         count++;
        //     } else{
        //         ans+=s.charAt(i);
        //     }
        // }
        // return Integer.parseInt(ans);
    }
}