class Solution {
    public List<String> commonChars(String[] words) {
        ArrayList<Character> common=new ArrayList<>();
        for(char c: words[0].toCharArray()){
            common.add(c);
        }
        for(int i=1;i<words.length;i++){
            ArrayList<Character> curr=new ArrayList<>();
            for(char ch: words[i].toCharArray()){
                if(common.contains(ch)){
                    curr.add(ch);
                    common.remove((Character)ch);
                }
            }
            common=curr;
        }
        ArrayList<String> al=new ArrayList<>();
        for(char c:common){
            al.add(String.valueOf(c));
        }
        return al;
    }
}