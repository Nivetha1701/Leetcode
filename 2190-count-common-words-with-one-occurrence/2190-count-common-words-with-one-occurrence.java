class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashSet<String> unique1=new HashSet<>();
        HashSet<String> unique2=new HashSet<>();

        HashSet<String> duplicate1=new HashSet<>();
        HashSet<String> duplicate2=new HashSet<>();

        for(String word:words1){
            if(!unique1.add(word)){
                duplicate1.add(word);
            }
        }
        for(String word:words2){
            if(!unique2.add(word)){
                duplicate2.add(word);
            }
        }
        unique1.removeAll(duplicate1);
        unique2.removeAll(duplicate2);

        unique1.retainAll(unique2);
        return unique1.size();
    }
}