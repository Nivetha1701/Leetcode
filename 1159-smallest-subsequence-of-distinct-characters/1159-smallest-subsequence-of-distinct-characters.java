class Solution {
    public String smallestSubsequence(String s) {
        Stack<Character> st=new Stack<>();
        boolean inStack[]=new boolean[256];
        int lastIndex[]=new int[256];
        for(int i=0;i<s.length();i++){
            lastIndex[s.charAt(i)]=i;
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(inStack[c]){
                continue;
            }
            while(!st.isEmpty() && c<st.peek() && lastIndex[st.peek()]>i){
                inStack[st.pop()]=false;
            }
            st.push(c);
            inStack[c]=true;
        }
        StringBuilder str=new StringBuilder();
        while(!st.isEmpty()){
            str.append(st.pop());
        }
        return str.reverse().toString();
    }
}