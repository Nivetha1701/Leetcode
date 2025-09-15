class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count=0;
        String str[]=text.split(" ");
        for(int i=0;i<str.length;i++){
            if(typed(str[i],brokenLetters)){
                count++;
            }
        }
        return count;
    }
    public static boolean typed(String word, String brokenLetters){
        char ch[]=word.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(brokenLetters.indexOf(ch[i])!=-1){
                return false;
            }
        }
        return true;
    }
}