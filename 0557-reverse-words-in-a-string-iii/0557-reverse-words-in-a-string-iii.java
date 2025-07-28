class Solution {
    public String reverseWords(String s) {
        String str[]=s.split(" ");
        String result="";
        for(int i=0;i<str.length;i++){
            StringBuilder sb=new StringBuilder(str[i]);
            result+=sb.reverse().toString();
            if(i!=str.length-1){
                result+=" ";
            }
        }
        return result;
    }
}