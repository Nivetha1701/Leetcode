class Solution {
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        int count1=0,count2=0;
        for(int i=0;i<n/2;i++){
            if(isVowel(s.charAt(i))){
                count1++;
            }
            if(isVowel(s.charAt(n-i-1))){
                count2++;
            }
        }
        return count1==count2;
    }
    public static boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c)!=-1;
    }
}