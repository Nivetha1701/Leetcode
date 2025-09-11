class Solution {
    public int maxFreqSum(String s) {
        int vowel=0, cons=0;
        int freq1[]=new int[10001];
        int freq2[]=new int[10001];
        char c[]=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(isVowel(c[i])){
                freq1[c[i]]++;
            } else{
                freq2[c[i]]++;
            }
        }
        Arrays.sort(freq1);
        Arrays.sort(freq2);
        return freq1[freq1.length-1]+freq2[freq2.length-1];
    }
    public static boolean isVowel(char c){
        return "aeiou".indexOf(c)!=-1;
    }
}