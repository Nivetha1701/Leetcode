class Solution {
    public String reverseVowels(String s) {
        Stack<Character> st=new Stack<>();
        String vowel = "aeiouAEIOU";
        for(char c:s.toCharArray()){
            if(vowel.indexOf(c)!=-1){
                st.push(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(vowel.indexOf(c)!=-1){
                sb.append(st.pop());
            } else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
        // Stack<Character> st=new Stack<>();
        // HashSet<Character> set=new HashSet<>(Arrays.asList('a','e','i','o','u',
        // 'A','E','I','O','U'));
        // for(char c:s.toCharArray()){
        //     if(set.contains(c)){
        //         st.push(c);
        //     }
        // }
        // StringBuilder sb=new StringBuilder();
        // for(char c:s.toCharArray()){
        //     if(set.contains(c)){
        //         sb.append(st.pop());
        //     } else{
        //         sb.append(c);
        //     }
        // }
        // return sb.toString();