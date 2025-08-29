class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(isPrefixAndSuffix(words[i],words[j])){
                    count++;
                }
            }
        }
        return count;
    }
    public static boolean isPrefixAndSuffix(String str1,String str2){
        if(str2.length()<str1.length()) return false;
        boolean prefix = str2.substring(0, str1.length()).equals(str1);
        boolean suffix = str2.substring(str2.length()-str1.length()).equals(str1);
        return prefix && suffix;
    }
}