class Solution {
    public String longestNiceSubstring(String s) {
        String res="";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String sub=s.substring(i,j);
                if(isNice(sub) && res.length()<sub.length()){
                    res=sub;
                }
            }
        }
        return res;
    }
    public static boolean isNice(String str){
        HashSet<Character> set=new HashSet<>();
        for(char c:str.toCharArray()){
            set.add(c);
        }
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isUpperCase(c) && !set.contains(Character.toLowerCase(c))){
                return false;
            }
            if(Character.isLowerCase(c) && !set.contains(Character.toUpperCase(c))){
                return false;
            }
        }
        return true;
    }
}