class Solution {
    public List<String> removeAnagrams(String[] words) {
        ArrayList<String> al=new ArrayList<>();
        al.add(words[0]);
        for(int i=1;i<words.length;i++){
            char s1[]=words[i].toCharArray();
            char s2[]=words[i-1].toCharArray();
            Arrays.sort(s1);
            Arrays.sort(s2);
            if(!Arrays.equals(s1,s2)){
                al.add(words[i]);
            }
        }
        return al;
    }
}