class Solution {
    public String reverseWords(String s) {
        String str[]=s.split(" ");
        String result="";
        for(int i=0;i<str.length;i++){
            result+=reverse(str[i]);
            if(i!=str.length-1){
                result+=" ";
            }
        }
        return result;
    }
    public String reverse(String a){
        StringBuilder sb=new StringBuilder(a);
        return sb.reverse().toString();
    }
}