class Solution {
    public boolean doesAliceWin(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(isVowel(c)){
                count++;
            }
        }
        if(count==0){
            return false;
        } 
        return true;
    }
    public static boolean isVowel(char c){
        return "aeiou".indexOf(c)!=-1;
    }
}