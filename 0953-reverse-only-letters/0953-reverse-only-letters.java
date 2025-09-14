class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        String str=sb.reverse().toString();
        int index=0;
        String res="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch)){
                res+=str.charAt(index++);
            } else{
                res+=ch;
            }
        }
        return res.toString();
    }
}