class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> lower=new HashSet<>();
        HashSet<Character> upper=new HashSet<>();
        int count=0;
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(Character.isUpperCase(ch))
            {
                upper.add(Character.toLowerCase(ch));
            }
            else
            {
                lower.add(ch);
            }
        }
        for(char c:lower)
        {
            if(upper.contains(c))
            {
                count++;
            }
        }
        return count;
        // int count=0;
        // String upper="";
        // String lower="";
        // HashSet<Character> set=new HashSet<>();
        // for(int i=0;i<word.length();i++){
        //     char c=word.charAt(i);
        //     if(!set.contains(c)){
        //         set.add(c);
        //         if(Character.isUpperCase(c)){
        //             upper+=c;
        //         } else{
        //             lower+=c;
        //         }
        //     }
        // }
        // for(int i=0;i<lower.length();i++){
        //     char ch=lower.charAt(i);
        //     for(int j=0;j<upper.length();j++){
        //         char c=upper.charAt(j);
        //         if(c==Character.toUpperCase(ch)){
        //             count++;
        //         }
        //     }
        // }
        // return count;
    }
}