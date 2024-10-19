class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> al=new ArrayList<>();
        String str=String.valueOf(x);
        for(int i=0;i<words.length;i++)
        {
            if(words[i].contains(str))
            {
                al.add(i);
            }
        }
        return al;
    }
}