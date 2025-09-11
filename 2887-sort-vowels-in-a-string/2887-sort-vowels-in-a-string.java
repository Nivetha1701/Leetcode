class Solution {
    public String sortVowels(String s) {
        String v="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(isVowel(c)){
                v+=c;
            }
        }
        char ch[]=v.toCharArray();
        int index=0;
        Arrays.sort(ch);
        String res="";
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                res+=ch[index++];
            } else {
                res+=s.charAt(i);
            }
        }
        return res;
    }
    public static boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || 
        c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
            return true;
        }
        return false;
    }
}