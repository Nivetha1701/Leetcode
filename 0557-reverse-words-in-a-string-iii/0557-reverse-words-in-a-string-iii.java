class Solution {
    public String reverseWords(String s) {
        String str[]=s.split(" ");
        StringBuilder result=new StringBuilder();
        for(int i=0;i<str.length;i++){
            StringBuilder sb=new StringBuilder(str[i]);
            result.append(sb.reverse().toString());
            if(i!=str.length-1){
                result.append(" ");
            }
        }
        return result.toString();
    }
}